from unittest import TestCase

from task_task import add_two_numbers, multiply_two_inputs

class AddSum(TestCase):
 
    def test_the_value_of_two_numbers(self):

        actual = add_two_numbers(3, 5)

        expected = 8

        self.assertEqual(actual, expected)



    def test_the_product_of_two_numbers(self):

        actual = multiply_two_inputs(3, 2)

        expected = 6

        self.assertEqual(actual, expected)   






