def findSmallest(numbers):

    smallest = numbers[0]

    smallest_index = 0

    for count in range(1, len(numbers)):

        if numbers[count] < smallest:

            smallest = numbers[count]

            smallest_index = count

       return smallest_index

def sellectionSort(numbers):

    newNum = []
    
    for count in range(len(numbers))

        smallest = findSmallest(numbers)
        newNum.append(numbers.pop(smallest))
    return newNum

    print selectionSort(5, 3, , 2, 10)

            
