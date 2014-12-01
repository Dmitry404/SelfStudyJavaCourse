public class C {
    private static Entry entry = new Entry();

    public static void main(String... args) {
        Entry[] entryArray = new Entry[10];
        for (int i = 0; i < 10; i++) {
            Entry entryTemp = new Entry();
            entryTemp.value = "str_" + i;
            entryArray[i] = entryTemp;
        }

        printArray(entryArray);
    }

    private static void printArray(Entry[] entryArr) {
        for (Entry entry : entryArr) {
            System.out.println(entry);
        }
    }

    static class Entry {
        public String toString() {
            return "Entry{" +
                    "value='" + value + '\'' +
                    '}';
        }

        private String value;
    }
}

/* Output:
Entry{value='str_0'}
Entry{value='str_1'}
Entry{value='str_2'}
Entry{value='str_3'}
Entry{value='str_4'}
Entry{value='str_5'}
Entry{value='str_6'}
Entry{value='str_7'}
Entry{value='str_8'}
Entry{value='str_9'}
 */