import java.util.Arrays;

public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    int size = 0;

    void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    void save(Resume resume) {
        if (getIndex(resume.getUuid()) != -1) {
            System.out.println("This summary is already stored");
        } else if (size == storage.length) {
            System.out.println("All places are occupied");
        } else {
            storage[size] = resume;
            size++;
        }
    }

    void update(Resume r) {
        int i = getIndex(r.getUuid());
        if (i == -1) {
            System.out.println("There is no such resume.");
        } else {
            storage[i] = r;
        }
    }

    Resume get(String uuid) {
        int i = getIndex(uuid);
        if (i == -1) {
            System.out.println("There is no such resume.");
            return null;
        } else {
            return storage[i];
        }
    }

    void delete(String uuid) {
        int i = getIndex(uuid);
        if (i == -1) {
            System.out.println("There is no such resume.");
        } else {
            storage[i] = storage[size - 1];
            storage[size - 1] = null;
            size--;
        }
    }

    {
        /**
         * @return array, contains only Resumes in storage (without null)
         */
    }

    Resume[] getAll() {
        return Arrays.copyOf(storage, size);
    }

    int size() {
        return size;
    }

    private int getIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return -1;
    }
}





