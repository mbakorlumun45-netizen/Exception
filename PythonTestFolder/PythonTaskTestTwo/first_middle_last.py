def sum_fir_mid_last(numbers):

    total = 0
    first = numbers[0]

    middle = numbers[len(numbers) // 2]

    if len(numbers) % 2 == 0:
    
        middle1 = numbers[len(numbers) // 2]

        middle2 = numbers[len(numbers) // 2 - 1]

        middle = (middle1 + middle2) / 2

    else: 
        middle = numbers[len(numbers) // 2]


    last = numbers[len(numbers)-1]

    total = first + middle + last

    return total

numbers = [2, 5, 8, 9, 10, 12, 21, 6, 3, 7]

result = sum_fir_mid_last(numbers)

print(result)

