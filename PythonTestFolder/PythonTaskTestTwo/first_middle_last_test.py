from unittest import TestCase

from first_middle_last import sum_fir_mid_last

class TestAddThree(TestCase):

    def test_first_middle_last(self):

        numbers = [2, 5, 8, 9, 10, 12, 21, 6, 3, 7]

        actual = sum_fir_mid_last(numbers)

        expected = 20

        self.assertEqual(actual, expected) 
