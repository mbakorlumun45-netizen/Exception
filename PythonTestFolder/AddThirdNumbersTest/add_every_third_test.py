from unittest import TestCase

from add_every_third import add_third

class ThirdNum(TestCase):
 
    def test_that_every_third_number_is_added(self):

        numbers = [2, 3, 4, 5, 6, 7, 8, 9, 13]

        actual = add_third(numbers)

        expected = 24

        self.assertEqual(actual, expected)

        
