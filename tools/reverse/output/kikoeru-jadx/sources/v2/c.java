package v2;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ud.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BreakIterator f22362a;

    public c(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f22362a = characterInstance;
    }

    @Override // ud.e
    public final int H(int i10) {
        return this.f22362a.following(i10);
    }

    @Override // ud.e
    public final int M(int i10) {
        return this.f22362a.preceding(i10);
    }
}
