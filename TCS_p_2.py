import re

def find_min_distance(name, good_string):
    # Find the indices of the letters in the good string
    indices = {ch: i for i, ch in enumerate(good_string)}

    # Calculate the distance for each letter in the name from the corresponding letter in the good string
    distances = []
    prev_good_letter = good_string[0]
    for letter in name:
        if letter in indices:
            distance = abs(ord(prev_good_letter) - ord(letter))
            distances.append(distance)
            prev_good_letter = letter
        else:
            distances.append(min(abs(ord(ch) - ord(letter)) for ch in good_string if ch != prev_good_letter))
            prev_good_letter = good_string[distances[-1]]

    # Return the total distance for the name
    return sum(distances)

# Input
good_string = input().strip()
name = input().strip()

# Output
print(find_min_distance(name, good_string))