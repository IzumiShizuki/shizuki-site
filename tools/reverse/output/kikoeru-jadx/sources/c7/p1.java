package c7;

import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements Parcelable {
    public static final Parcelable.Creator<p1> CREATOR = new android.support.v4.media.a(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f3690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f3691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f3693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f3694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractCollection f3695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f3696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f3697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PlaybackState f3698l;

    public p1(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, ArrayList arrayList, long j14, Bundle bundle) {
        AbstractCollection arrayList2;
        this.f3687a = i10;
        this.f3688b = j10;
        this.f3689c = j11;
        this.f3690d = f10;
        this.f3691e = j12;
        this.f3692f = i11;
        this.f3693g = charSequence;
        this.f3694h = j13;
        if (arrayList == null) {
            ya.g0 g0Var = ya.i0.f25998b;
            arrayList2 = ya.a1.f25946e;
        } else {
            arrayList2 = new ArrayList(arrayList);
        }
        this.f3695i = arrayList2;
        this.f3696j = j14;
        this.f3697k = bundle;
    }

    public static p1 a(PlaybackState playbackState) {
        ArrayList arrayList;
        Bundle bundleA = null;
        if (playbackState == null) {
            return null;
        }
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                if (customAction != null) {
                    PlaybackState.CustomAction customAction2 = customAction;
                    Bundle extras = customAction2.getExtras();
                    e1.t(extras);
                    o1 o1Var = new o1(customAction2.getAction(), customAction2.getName(), customAction2.getIcon(), extras);
                    o1Var.f3679e = customAction2;
                    arrayList2.add(o1Var);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundleA = n1.a(playbackState);
            e1.t(bundleA);
        }
        p1 p1Var = new p1(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), bundleA);
        p1Var.f3698l = playbackState;
        return p1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f3687a);
        sb.append(", position=");
        sb.append(this.f3688b);
        sb.append(", buffered position=");
        sb.append(this.f3689c);
        sb.append(", speed=");
        sb.append(this.f3690d);
        sb.append(", updated=");
        sb.append(this.f3694h);
        sb.append(", actions=");
        sb.append(this.f3691e);
        sb.append(", error code=");
        sb.append(this.f3692f);
        sb.append(", error message=");
        sb.append(this.f3693g);
        sb.append(", custom actions=");
        sb.append(this.f3695i);
        sb.append(", active item id=");
        return a0.c.H(this.f3696j, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f3687a);
        parcel.writeLong(this.f3688b);
        parcel.writeFloat(this.f3690d);
        parcel.writeLong(this.f3694h);
        parcel.writeLong(this.f3689c);
        parcel.writeLong(this.f3691e);
        TextUtils.writeToParcel(this.f3693g, parcel, i10);
        parcel.writeTypedList(this.f3695i);
        parcel.writeLong(this.f3696j);
        parcel.writeBundle(this.f3697k);
        parcel.writeInt(this.f3692f);
    }

    public p1(Parcel parcel) {
        this.f3687a = parcel.readInt();
        this.f3688b = parcel.readLong();
        this.f3690d = parcel.readFloat();
        this.f3694h = parcel.readLong();
        this.f3689c = parcel.readLong();
        this.f3691e = parcel.readLong();
        this.f3693g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        AbstractCollection abstractCollectionCreateTypedArrayList = parcel.createTypedArrayList(o1.CREATOR);
        if (abstractCollectionCreateTypedArrayList == null) {
            ya.g0 g0Var = ya.i0.f25998b;
            abstractCollectionCreateTypedArrayList = ya.a1.f25946e;
        }
        this.f3695i = abstractCollectionCreateTypedArrayList;
        this.f3696j = parcel.readLong();
        this.f3697k = parcel.readBundle(e1.class.getClassLoader());
        this.f3692f = parcel.readInt();
    }
}
