import random

frequency = [0, 0, 0, 0, 0, 0]

for roll in range(1000):

    face = random.randrange(1, 7)

    print("Roll", roll + 1, ":", face)

    frequency[face - 1] += 1

print("face count")

for face in range(1, 7):

    print(face, frequency[face - 1])    
