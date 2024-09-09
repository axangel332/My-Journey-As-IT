import 'package:flutter/material.dart';
import 'package:flutter_application_2/dynamicpage.dart';

class StarPage extends StatelessWidget {
  const StarPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Star Rating'),
      ),
      body: const Center(
        child: Row(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(
              Icons.star,
              size: 50,
              color: Colors.yellow,
            ),
            Icon(
              Icons.star,
              size: 50,
              color: Colors.yellow,
            ),
            Icon(
              Icons.star,
              size: 50,
              color: Colors.yellow,
            ),
            Icon(
              Icons.star,
              size: 50,
            ),
            Icon(
              Icons.star,
              size: 50,
            ),
          ],
        ),
      ),
    );
  }
}

void main() {
  runApp(const MaterialApp(
    home: DynamicPage(),
  ));
}
