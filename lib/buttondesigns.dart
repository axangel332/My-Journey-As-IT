import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class buttondesigns extends StatelessWidget {
  const buttondesigns({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Button Designs Sumalan'),
        leading: IconButton(
          onPressed: () {
            Navigator.pop(context);
          },
          icon: const Icon(Icons.arrow_back),
        ),
      ), // AppBar
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            ElevatedButton.icon(
              onPressed: () {},
              icon: const Icon(Icons.download, color: Colors.white),
              label: const Text(
                'Download',
                style: TextStyle(color: Colors.white),
              ),
              style: ElevatedButton.styleFrom(
                backgroundColor: Colors.blue,
              ),
            ),
            TextButton.icon(
              onPressed: () {},
              icon: const Icon(Icons.download),
              label: const Text('Download'),
            ),
            OutlinedButton.icon(
              onPressed: () {},
              icon: const Icon(Icons.download),
              label: const Text('Download'),
            ),
            ElevatedButton(
              onPressed: () {},
              style: ElevatedButton.styleFrom(
                backgroundColor: Colors.blue,
              ),
              child: const Row(
                mainAxisSize: MainAxisSize.min,
                children: const [
                  Text(
                    'Download',
                    style: TextStyle(color: Colors.white),
                  ),
                  SizedBox(width: 5),
                  Icon(Icons.download, size: 24, color: Colors.white),
                ],
              ),
            ),
            ElevatedButton(
              style: ElevatedButton.styleFrom(
                backgroundColor: Colors.blue,
                shape: const StadiumBorder(),
              ),
              onPressed: () {},
              child: const Text(
                'Pill Button',
                style: TextStyle(color: Colors.white),
              ),
            ),
            SizedBox.fromSize(
              size: const Size(56, 56),
              child: ClipOval(
                child: Material(
                  color: Colors.blue,
                  child: InkWell(
                    splashColor: Colors.green,
                    onTap: () {},
                    child: const Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [
                        Icon(Icons.shopping_cart, color: Colors.white),
                        Text(
                          "Buy",
                          style: TextStyle(color: Colors.white),
                        ),
                      ],
                    ),
                  ),
                ),
              ),
            ),
            GestureDetector(
              onTap: () {},
              child: Container(
                width: 240,
                height: 80,
                alignment: Alignment.center,
                decoration: BoxDecoration(
                  borderRadius: BorderRadius.circular(15),
                  color: Colors.blue[200],
                ),
                child: const Text('Button'),
              ),
            ),
            const SizedBox(height: 20),
            FloatingActionButton.extended(
              label: const Text(
                'Download',
                style: TextStyle(color: Colors.white),
              ),
              backgroundColor: Colors.black,
              icon: const Icon(Icons.download, size: 24, color: Colors.white),
              onPressed: () {},
            ),
            const SizedBox(height: 20),
            SizedBox(
              height: 100,
              width: 300,
              child: ElevatedButton(
                style: ElevatedButton.styleFrom(
                  backgroundColor: Colors.redAccent,
                  side: const BorderSide(
                      width: 3, color: Color.fromARGB(255, 69, 55, 50)),
                  elevation: 3,
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(30),
                  ),
                  padding: const EdgeInsets.all(20),
                ),
                onPressed: () {},
                child: const Text(
                  'Elevated Button',
                  style: TextStyle(color: Colors.white),
                ),
              ),
            ),
          ],
        ), // Column
      ), // Center
    ); // Scaffold
  }
}
