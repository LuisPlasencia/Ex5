package es.ulpgc.eite.cleancode.lettersandnumbers;

import android.view.View;
import android.widget.ListView;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import es.ulpgc.eite.cleancode.lettersandnumbers.data.BaseData;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

public class InstrumentedRobot {


    private static Matcher<View> withListSize( String str) {

        final int size = Integer.valueOf(str);

        return new TypeSafeMatcher<View>() {

            @Override
            public boolean matchesSafely(final View view) {
                return ((ListView) view).getCount() == size;
            }

            @Override
            public void describeTo(final Description description) {
                description.appendText("ListView should have " + size + " items");
            }
        };
    }

    private static Matcher<View> withValueAtPosition(String str1, String str2) {

        final String val = str1;
        final int pos = Integer.valueOf(str2);

        return new TypeSafeMatcher<View>() {

            @Override
            public boolean matchesSafely(final View view) {
                int size = ((ListView) view).getCount();
                if (pos >= size) {
                    return false;
                }

                Object obj = ((ListView) view).getItemAtPosition(pos);
                BaseData item = (BaseData) obj;
                return item.getValue().equals(val);
            }

            @Override
            public void describeTo(final Description description) {
                description.appendText(
                    "ListView should have " + val + " value at position " + pos
                );
            }
        };
    }



    public void mostramosListaDeLetrasConDimensionP1(String p1) {
        onView (withId (R.id.letterList)).check (matches (withListSize (p1)));
    }

    public void pulsamosBotonDeListaDeLetras() {
        onView(withId(R.id.letterListButton)).perform(click());
    }

    public void mostramosLetraEnListaEnPosicionP1ConValorP2(String p1, String p2) {
        onView(withId (R.id.letterList))
            .check(matches(withValueAtPosition(p2, p1)));
    }

    public void pulsamosCeldaDeLetraEnPosicionP1(String p1) {
        onData(allOf())
            .inAdapterView(withId(R.id.letterList))
            .atPosition(Integer.valueOf(p1))
            .perform(click());
    }

    public void mostramosListaDeNumerosConDimensionP1(String p1) {
        onView (withId (R.id.numberList)).check (matches (withListSize (p1)));
    }

    public void pulsamosBotonDeListaDeNumeros() {
        onView(withId(R.id.numberListButton)).perform(click());
    }

    public void mostramosNumeroEnListaEnPosicionP1ConValorP2(String p1, String p2) {
        onView(withId (R.id.numberList))
            .check(matches(withValueAtPosition(p2, p1)));
    }

    public void pulsamosBackEnListaDeNumeros() {
        pressBack();
    }
}