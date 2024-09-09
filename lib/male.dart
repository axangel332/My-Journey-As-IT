import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class male extends StatelessWidget {
  const male({super.key});

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
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Text(
              '',
              style: txtdesign(),
              textAlign: TextAlign.center,
            ),
            const SizedBox(height: 20),
            buildNewRow(),
          ],
        ),
      ),
    );
  }

  Widget buildNewRow() {
    return Column(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        const Text(
          'This is custom text',
          style: TextStyle(
            fontWeight: FontWeight.bold,
            fontSize: 32,
          ),
        ),
        const SizedBox(height: 10),
        Image.asset('assets/pizza.png'),
        const SizedBox(height: 10),
      ],
    );
  }
}
