package net.kibotu.berlinplaces;

import android.os.Bundle;
import android.support.annotation.NonNull;

import net.kibotu.berlinplaces.models.fake.FakeModel;
import net.kibotu.berlinplaces.ui.map.MapFragment;
import net.kibotu.berlinplaces.ui.place.PlaceFragment;
import net.kibotu.berlinplaces.ui.places.PlacesFragment;

import org.parceler.Parcels;

import static com.common.android.utils.extensions.FragmentExtensions.replaceByFading;
import static com.common.android.utils.extensions.FragmentExtensions.replaceToBackStackBySlidingHorizontally;

/**
 * Created by Nyaruhodo on 05.05.2016.
 */
public class FragmentProvider {

    public static void showMap() {
        replaceByFading(new MapFragment());
    }

    public static void showPlaces() {
        replaceByFading(new PlacesFragment());
    }

    public static void showPlace(@NonNull final FakeModel item) {
        final Bundle bundle = new Bundle();
        bundle.putParcelable(FakeModel.TAG, Parcels.wrap(item));
        final PlaceFragment fragment = new PlaceFragment();
        fragment.setArguments(bundle);
        replaceToBackStackBySlidingHorizontally(fragment);
    }
}
