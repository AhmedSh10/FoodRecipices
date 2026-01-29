# 🍳 Food Recipes - Recipe Discovery App

<div align="center">
  
  ![Android](https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
  ![Kotlin](https://img.shields.io/badge/Language-Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
  ![Material Design](https://img.shields.io/badge/Design-Material-757575?style=for-the-badge&logo=materialdesign&logoColor=white)
  
</div>

## 📋 Overview

**Food Recipes** is a delightful Android application that helps users discover, browse, and save their favorite recipes. Whether you're looking for quick meals, healthy options, or gourmet dishes, this app provides a comprehensive collection of recipes with detailed instructions and ingredients.

## ✨ Key Features

- **🔍 Recipe Search**: Find recipes by name, ingredient, or cuisine
- **📖 Detailed Instructions**: Step-by-step cooking instructions
- **🥗 Ingredient Lists**: Complete list of required ingredients
- **⏱️ Cooking Time**: Preparation and cooking duration
- **⭐ Favorites**: Save your favorite recipes for quick access
- **🍽️ Categories**: Browse by meal type, cuisine, or dietary preferences
- **📱 Clean UI**: Beautiful and intuitive user interface
- **🖼️ Recipe Images**: High-quality food photography

## 🛠️ Tech Stack

- **Language**: Kotlin
- **Architecture**: MVVM (Model-View-ViewModel)
- **UI**: XML Layouts with Material Design
- **RecyclerView**: Efficient list display
- **Room Database**: Local data persistence
- **Retrofit**: API integration (if applicable)
- **Glide/Coil**: Image loading and caching
- **Coroutines**: Asynchronous operations
- **LiveData/Flow**: Reactive data handling

## 📱 App Screens

### Home Screen
- Featured recipes
- Popular categories
- Quick search bar
- Trending recipes

### Recipe Details
- Recipe image
- Ingredients list
- Step-by-step instructions
- Cooking time and servings
- Nutritional information
- Save to favorites button

### Search & Filter
- Search by keyword
- Filter by category
- Filter by cooking time
- Dietary restrictions filter

### Favorites
- Saved recipes collection
- Quick access to favorites
- Remove from favorites option

## 🚀 Getting Started

### Prerequisites

- Android Studio Arctic Fox or later
- Android SDK 24 or higher
- Kotlin 1.8+

### Installation

1. **Clone the repository**:
```bash
git clone https://github.com/AhmedSh10/FoodRecipices.git
```

2. **Open in Android Studio**

3. **Sync Gradle dependencies**

4. **Build and run the project**

## 📂 Project Structure

```
app/
├── data/
│   ├── models/         # Recipe data models
│   ├── database/       # Room database
│   ├── repository/     # Data repository
│   └── api/            # API services (if applicable)
├── ui/
│   ├── home/           # Home screen
│   ├── details/        # Recipe details screen
│   ├── favorites/      # Favorites screen
│   └── adapter/        # RecyclerView adapters
├── viewmodel/          # ViewModels
└── utils/              # Utility functions
```

## 🍽️ Recipe Categories

- 🍳 Breakfast
- 🥗 Salads
- 🍝 Main Dishes
- 🍰 Desserts
- 🥤 Beverages
- 🍲 Soups
- 🥙 Snacks
- 🌮 International Cuisine

## 🔧 Data Model

```kotlin
data class Recipe(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String,
    val ingredients: List<String>,
    val instructions: List<String>,
    val prepTime: Int,
    val cookTime: Int,
    val servings: Int,
    val category: String,
    val difficulty: String,
    val isFavorite: Boolean = false
)
```

## 🎯 Use Cases

- **Home Cooking**: Find recipes for daily meals
- **Meal Planning**: Plan weekly menus
- **Learning to Cook**: Follow step-by-step instructions
- **Dietary Needs**: Filter by dietary restrictions
- **Entertaining**: Discover recipes for special occasions

## 🔮 Future Enhancements

- [ ] Add shopping list feature
- [ ] Implement meal planner
- [ ] Add cooking timer
- [ ] User recipe submissions
- [ ] Social sharing
- [ ] Video tutorials
- [ ] Nutritional calculator
- [ ] Recipe ratings and reviews
- [ ] Offline mode
- [ ] Multiple language support

## 🤝 Contributing

Contributions are welcome! Feel free to:
- Add new recipes
- Improve UI/UX
- Add new features
- Fix bugs
- Improve documentation

## 📄 License

This project is available for educational and personal use.

## 👨‍💻 Developer

**Ahmed Sherif**

- GitHub: [@AhmedSh10](https://github.com/AhmedSh10)
- LinkedIn: [Ahmed Sherif](https://linkedin.com/in/dev-ahmed-sherif)

## 🙏 Acknowledgments

- Recipe data sources
- Food photography contributors
- Open-source community
- Android development community

---

<div align="center">
  
  **⭐ If you find this project useful, please consider giving it a star!**
  
  **🍳 Happy Cooking!**
  
</div>
