#import random

#numbers = []

#for count in range(10):

    #number = random.randint(1, 10)

    #numbers.append(number) 

#print(numbers)




#numbers = [12, 45, 54, 78, 90, 3, 5, 21, 32, 54];

#count = 0

#for number in numbers:

    #count+= 1

#print(count)




#list = [3, 4, 5, 6, 7, 8, 9, 2, 10]

#sum = 0

#for count in range(len(list)):

    #if count % 2 == 0:

       #sum = sum + list[count]
 
#print(sum)



#list = [3, 4, 5, 6, 7, 8, 9, 2, 10]

#sum = 0

#for count in range(len(list)):

    #if count % 2 == 1:

       #sum = sum + list[count]
 
#print(sum)



#list = [3, 4, 5, 6, 7, 8, 9, 2, 10, 32, 5, 12]

#product = 1

#for count in range(len(list)):

    #if count % 3 == 0:

        #product *= list[count]

#print(product)



#list = [3, 4, 5, 6, 7, 8, 9, 2, 10, 32, 5, 12]

#total = 0
#average = 0
#for count in range(len(list)):
    
    #total = total + list[count]

    #average = total / len(list)

#print(average)




#list = [3, 4, 5, 6, 7, 8, 9, 2, 10, 32]

#largest = list[0]
#for count in list:

    #if largest < count:

        #largest = count

#print(largest)



#list = [3, 4, 5, 6, 7, 8, 9, 2, 10, 32]

#smallest = list[0]
#for count in list:

    #if smallest > count:

        #smallest = count

#print(smallest)



#strings = ["orban", "mathias", "cupcake", "popcorn", "apple", "quava"]

#count = 0;
#for word in strings:

    #if len(word) >= 2:
        #if word[0] == word[-1]:

            #count+=1

#print(count)



#numbers = list(range(1, 16))

#print(numbers)



#def add_every_third(numbers):

    #total = 0

    #for count in range(0, len(numbers), 3):
        #total = total + numbers[count]

    #return total

#numbers = [2, 3, 4, 5, 6, 7, 8, 9, 13]

#result = add_every_third(numbers)

#print(result)



def first_middle_last(numbers):

    first = numbers[0]

    middle = numbers[len(numbers) // 2]

    last = numbers[-1]

    total = first + middle + last

    return total

numbers = [2, 5, 8, 9, 10, 12, 21, 6, 3, 7]

result = first_middle_last(numbers)

print(result)





























