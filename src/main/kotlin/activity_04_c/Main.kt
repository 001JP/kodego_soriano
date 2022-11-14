package activity_04_c


/*
Covered Topic(s) : Classes

Create class for

Poultry

Fish

Canned goods

Snacks

Frozen Products

Fruits

Vegetables

Condiments

Furniture

Appliances

Clothes
Pet

Sanitary Products

Personal Care

Add 5 more type of items you can find in the grocery.

Identify the attributes for all the classes mentioned.*/


data class Poultry(val typeOfPoultry: String, val Quantity: String)

data class Fish(val typeOfFish: String, val weight: String)

data class  CannedGoods(val brand: String, val typeOfCannedGoods: String, val grams: Int)

data class Snacks(val brand: String, val ingredients: ArrayList<String>, val grams: Int)

data class FrozenProducts(val brand: String, val typeOfFrozenProducts: String, val grams: Int)

data class Fruits(val typeOfFruit: String, val weightInGrams: Int)

data class Vegetables(val typeOfVegetables: String, val weightInGrams: Int)

data class Condiments(val brand: String, val typeOfCondiments: String, val grams: Int)

data class Furniture(val typeOfFurniture: String, val materials: ArrayList<String>)

data class Appliances(val typeOfAppliances: String, val brand: String, val price: Int)

data class Clothes(val brand: String, val typeOfClothing: String, val size: Int)

data class Pet(val typeOfAnimal: String, val age: Int, val name: Int)

data class SanitaryProducts(val brand: String)

data class PersonalCare(val brand: String, val typeOfPersonalCare: String)

data class Liquor(val brand: String, val ml : Int)

data class Beverages(val brand: String, val ml: Int)

data class Bread(val typeOfBread: String, val brand: String, val weightInGrams: Int)

data class PetFood(val forCats: Boolean, val forDog: Boolean, val brand: String, val grams: Int, val flavor: String, val ingredients: ArrayList<String>)

data class SchoolSupply(val gradeYear: Int, val forReading: Boolean, val forWriting: Boolean, val typeOfSchoolSupply: String)