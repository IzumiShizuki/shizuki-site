package q2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17601a;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f17601a == ((h) obj).f17601a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17601a;
    }

    public final String toString() {
        int i10 = this.f17601a;
        return i10 == 0 ? "Button" : i10 == 1 ? "Checkbox" : i10 == 2 ? "Switch" : i10 == 3 ? "RadioButton" : i10 == 4 ? "Tab" : i10 == 5 ? "Image" : i10 == 6 ? "DropdownList" : i10 == 7 ? "Picker" : i10 == 8 ? "Carousel" : "Unknown";
    }
}
