package c7;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements Parcelable {
    public static final Parcelable.Creator<b1> CREATOR = new android.support.v4.media.a(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f3590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediaSession.QueueItem f3592c;

    public b1(MediaSession.QueueItem queueItem, q0 q0Var, long j10) {
        if (q0Var == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
        if (j10 == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.f3590a = q0Var;
        this.f3591b = j10;
        this.f3592c = queueItem;
    }

    public static ArrayList a(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) it.next();
            arrayList.add(new b1(queueItem, q0.a(queueItem.getDescription()), queueItem.getQueueId()));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem { Description=");
        sb.append(this.f3590a);
        sb.append(", Id=");
        return a0.c.H(this.f3591b, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        this.f3590a.writeToParcel(parcel, i10);
        parcel.writeLong(this.f3591b);
    }

    public b1(Parcel parcel) {
        this.f3590a = q0.CREATOR.createFromParcel(parcel);
        this.f3591b = parcel.readLong();
    }
}
