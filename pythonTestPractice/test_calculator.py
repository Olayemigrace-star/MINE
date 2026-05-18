from unittest import TestCase

from calculator import *


class TestToCheckTheCalculator(TestCase):
    
    def test_to_check_addition_is_adding(self):
        
        num1 = 10
        num2 = 10
        result = add(num1, num2)
        self.assertEqual(result, 20)
        
    def test_to_check_if_number_is_palindrome(self):
        
        num = 121
        result = palindrome(num)
        self.assertEqual(result, 121)
        
    def test_to_check_if_number_is_reverse(self):
    
        num = 121
        result = palindrome(num)
        self.assertEqual(result, 121)
        
        
        
        
        
        
