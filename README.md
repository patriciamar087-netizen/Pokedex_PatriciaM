Answers to #10 Conclusion questions 
1. The key type is String and the value type is Pokemon. The Pokémon's lowercase name is useful as a key because each Pokémon can be looked up directly by name, making searches fast and easy. Names are also easy for users to enter through the menu.
2. Bucket 6: meowth -> testmon -> null
   bucketIndex = hash(key) % 11;
   Even though they landed in the same bucket, their full hash codes do not have to match. Different hash codes can produce the same bucket index after taking % 11.
3. Bucket 6: meowth -> testmon -> null
   get() first checks meowth. Since the key does not match, it follows the next reference to testmon. It compares the key again, finds a match, and returns the Pokémon object. The search stops when the key is found or when the end of the chain (null) is reached.
4. insert() searches the chain for an existing key. If the key is found, it replaces the stored value instead of creating another node with the same key. This keeps each key unique.
  When remove() deletes the first node in a bucket, the table entry for that bucket is updated to point to the second node in the chain. The rest of the chain remains connected.
5. As more names collide into the same bucket, the linked list becomes longer. Lookups take more time because get() must examine more nodes before finding the correct key or determining it is missing.
6. == checks whether two references point to the exact same object in memory. Pokemon.equals() compares the actual field values (id, name, heightDm, weightHg, and baseExperience).
A matching hashCode() is needed so that two equal Pokémon objects produce the same hash code, which follows Java's equality contract.
This hash table uses String keys, so the table uses the String class's hashCode() method when calculating bucket indexes.

