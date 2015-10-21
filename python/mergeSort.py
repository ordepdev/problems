def merge(left, right, lt):
	result = []
	i, j = 0, 0
	while i < len(left) and j < len(right):
		if lt(left[i],right[j]):
			result.append(left[i])
			i += 1
		else:
			result.append(right[j])
			j += 1
	while i < len(left):
		result.append(left[i])
		i += 1
	while j < len(right):
		result.append(right[j])
		j += 1
	print 'merged:', result
	return result

def sort(L, lt = lambda x,y: x < y):
	if len(L) < 2:
		return L[:]
	middle = int(len(L)/2)
	left = sort(L[:middle], lt)
	right = sort(L[middle:], lt)
	print 'merging', left, 'and', right
	return merge(left, right, lt)

#L = [35,4,5,29,17,58,0]
#sort(L)