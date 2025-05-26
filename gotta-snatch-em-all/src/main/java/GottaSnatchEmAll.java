import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return Set.copyOf(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.isEmpty() || theirCollection.isEmpty()) {
            return false;
        }

        if (myCollection.size() != theirCollection.size()) {
            return false;
        }

        if (myCollection.equals(theirCollection)) {
            return false;
        }

        return true;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> interseccion = new HashSet<>(collections.get(0));

        for (Set<String> set : collections) {
            interseccion.retainAll(set);
        }
        return interseccion;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        return collections.stream()
                .flatMap(Set::stream)
                .collect(Collectors.toSet());
    }
}
