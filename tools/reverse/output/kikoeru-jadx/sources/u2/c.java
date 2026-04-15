package u2;

import java.text.CharacterIterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements CharacterIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f21214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21216c = 0;

    public c(CharSequence charSequence, int i10) {
        this.f21214a = charSequence;
        this.f21215b = i10;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i10 = this.f21216c;
        if (i10 == this.f21215b) {
            return (char) 65535;
        }
        return this.f21214a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f21216c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f21215b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f21216c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i10 = this.f21215b;
        if (i10 == 0) {
            this.f21216c = i10;
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f21216c = i11;
        return this.f21214a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i10 = this.f21216c + 1;
        this.f21216c = i10;
        int i11 = this.f21215b;
        if (i10 < i11) {
            return this.f21214a.charAt(i10);
        }
        this.f21216c = i11;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i10 = this.f21216c;
        if (i10 <= 0) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f21216c = i11;
        return this.f21214a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i10) {
        if (i10 > this.f21215b || i10 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f21216c = i10;
        return current();
    }
}
