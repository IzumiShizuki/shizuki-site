package g8;

import android.os.Parcel;
import android.util.SparseIntArray;
import j2.h0;
import o.e;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f7446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f7447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7452j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7453k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e(0), new e(0), new e(0));
    }

    @Override // g8.b
    public final c a() {
        Parcel parcel = this.f7447e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f7452j;
        if (i10 == this.f7448f) {
            i10 = this.f7449g;
        }
        return new c(parcel, iDataPosition, i10, h0.n(new StringBuilder(), this.f7450h, "  "), this.f7443a, this.f7444b, this.f7445c);
    }

    @Override // g8.b
    public final boolean e(int i10) {
        while (this.f7452j < this.f7449g) {
            int i11 = this.f7453k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f7452j;
            Parcel parcel = this.f7447e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.f7453k = parcel.readInt();
            this.f7452j += i13;
        }
        return this.f7453k == i10;
    }

    @Override // g8.b
    public final void i(int i10) {
        int i11 = this.f7451i;
        SparseIntArray sparseIntArray = this.f7446d;
        Parcel parcel = this.f7447e;
        if (i11 >= 0) {
            int i12 = sparseIntArray.get(i11);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i12);
            parcel.writeInt(iDataPosition - i12);
            parcel.setDataPosition(iDataPosition);
        }
        this.f7451i = i10;
        sparseIntArray.put(i10, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i10);
    }

    public c(Parcel parcel, int i10, int i11, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f7446d = new SparseIntArray();
        this.f7451i = -1;
        this.f7453k = -1;
        this.f7447e = parcel;
        this.f7448f = i10;
        this.f7449g = i11;
        this.f7452j = i10;
        this.f7450h = str;
    }
}
