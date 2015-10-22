def selSort(L):
	for i in range(len(L) - 1):
		minIndex = i
		minValue = L[i]
		j = i + 1
		while j < len(L):
			if minVal > L[j]:
				minIndex = j
				minValue = L[j]
			j += 1
		temp = L[i]
		L[i] = L[minIndex]
		L[minIndex] = temp
	return L
