package d;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f5262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f5263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field f5264c;

    public z(Field field, Field field2, Field field3) {
        this.f5262a = field;
        this.f5263b = field2;
        this.f5264c = field3;
    }

    @Override // d.x
    public final boolean a(InputMethodManager inputMethodManager) {
        try {
            this.f5264c.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    @Override // d.x
    public final Object b(InputMethodManager inputMethodManager) {
        try {
            return this.f5262a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // d.x
    public final View c(InputMethodManager inputMethodManager) {
        try {
            return (View) this.f5263b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }
}
