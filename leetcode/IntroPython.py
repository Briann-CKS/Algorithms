"""
Introduction to Python
This program takes input from the user and does data type conversions
"""
name = raw_input('What is your name? ')
print("Hello " + name + ". Nice to meet you!")

age = input ('How old are you? (Please enter an integer): ')

my_age = 20
difference = abs(my_age - age)
difference = str (difference)

if age > my_age:
	print("That's cool! You are " + difference + " years older than me!")
elif my_age == age:
	print("Hey what a coincidence, I am as old as you!")
else: 
	print("That's cool! You are " + difference + " years younger than me!")
