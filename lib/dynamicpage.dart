import 'package:flutter/material.dart';

class DynamicPage extends StatelessWidget {
  const DynamicPage({super.key});

  TextStyle txtdesign() {
    return const TextStyle(
      fontWeight: FontWeight.bold,
      fontSize: 18,
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.grey[200],
      appBar: AppBar(
        backgroundColor: Colors.blue,
        elevation: 0,
        centerTitle: true,
        title: const Text(
          'Icon Widget',  
          style: TextStyle(color: Colors.white),
        ),
      ),
      body: ListView(
        padding: const EdgeInsets.all(16.0),
        children: [
          const SizedBox(height: 20),
          buildNewRow(),
          const SizedBox(height: 20),
          const Row(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Icon(
                Icons.favorite,
                color: Colors.pink,
                size: 24.0,
              ),
              Icon(
                Icons.audiotrack,
                color: Colors.green,
                size: 30.0,
              ),
              Icon(
                Icons.beach_access,
                color: Colors.blue,
                size: 36.0,
              ),
            ],
          ),
          const SizedBox(height: 20),
          buildStar(2, 90),
          const SizedBox(height: 20),
          buildRowTabs(),
        ],
      ),
    );
  }

  Widget buildNewRow() {
    return Column(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        const SizedBox(height: 10),
        Image.asset('assets/pizza.png'),
        const SizedBox(height: 10),
        const Text(
          'PIZZA',
          style: TextStyle(
            fontWeight: FontWeight.bold,
            fontSize: 32,
          ),
        ),
        const Text(
          'Pizza is a popular Italian dish consisting of a round, flat dough base topped with tomato sauce, cheese, and various other ingredients such as meats, vegetables, and herbs. It is baked in an oven until the crust is crispy and the cheese is melted and bubbly. With its versatile toppings and savory flavors, pizza has become a beloved comfort food enjoyed around the world.',
          textAlign: TextAlign.center,
          style: TextStyle(
            fontWeight: FontWeight.normal,
            fontSize: 16,
          ),
        ),
      ],
    );
  }

  Row buildStar(int rating, int reviews) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        for (int i = 1; i <= rating; i++)
          const Icon(
            Icons.star,
            color: Colors.green,
            size: 50,
          ),
        for (int i = 1; i <= (5 - rating); i++)
          const Icon(
            Icons.star_border,
            size: 50,
          ),
        const SizedBox(width: 20),
        Text(
          '$reviews Reviews',
          style: const TextStyle(
            fontWeight: FontWeight.bold,
            fontSize: 18,
          ),
        ),
      ],
    );
  }

  Row buildRowTabs() {
    return Row(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        buildIconTab(Icons.kitchen, 'PREP', '25 mins'),
        const SizedBox(width: 20),
        buildIconTab(Icons.timer, 'COOK', '1 hr'),
        const SizedBox(width: 20),
        buildIconTab(Icons.restaurant, 'FEEDS', '4-6'),
      ],
    );
  }

  Column buildIconTab(IconData iconval, String title, String time) {
    return Column(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        Icon(iconval, color: Colors.green),
        const SizedBox(height: 10),
        Text(
          title,
          style: const TextStyle(fontWeight: FontWeight.bold),
        ),
        const SizedBox(height: 10),
        Text(
          time,
          style: const TextStyle(fontWeight: FontWeight.bold),
        ),
      ],
    );
  }
}
