def findAll(words, letters):
	"""
	assumes: words is a list of words in lowercase.
					 letters is a str of lowercase letters.
					 No letter occurs in lStr more than once.
	returns: a list of all the words in words that
					 contain each of the letters in letters
					 exactly once and no letters not in letters.
	"""
	
	result = []
	letters = sorted(letters)
	for word in words:
		if sorted(word) == letters:
			result.append(word)
	return result

words = ['abc', 'bca', 'foo', 'bar']
letters = 'abc'
print findAll(words, letters)