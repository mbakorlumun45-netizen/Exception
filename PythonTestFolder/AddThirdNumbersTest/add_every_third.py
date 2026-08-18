def add_third(numbers):

    total = 0

    for count in range(2, len(numbers), 3):
        total = total + numbers[count]

    return total

numbers = [2, 3, 4, 5, 6, 7, 8, 9, 13]

result = add_third(numbers)

print(result)

