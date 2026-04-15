package b7;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2205a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2207c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(c2 c2Var, Looper looper) {
        super(looper);
        this.f2207c = c2Var;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.f2205a) {
            case 1:
                WeakReference weakReference = (WeakReference) this.f2207c;
                if (weakReference == null) {
                    return;
                }
                Messenger messenger = (Messenger) weakReference.get();
                c7.j jVar = (c7.j) ((WeakReference) this.f2206b).get();
                if (messenger == null || jVar == null) {
                    return;
                }
                Bundle data = message.getData();
                c7.e1.t(data);
                try {
                    int i10 = message.what;
                    if (i10 == 1) {
                        c7.e1.t(data.getBundle("data_root_hints"));
                        data.getString("data_media_item_id");
                        return;
                    }
                    if (i10 != 2) {
                        if (i10 != 3) {
                            Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                            return;
                        }
                        c7.e1.t(data.getBundle("data_options"));
                        c7.e1.t(data.getBundle("data_notify_children_changed_options"));
                        String string = data.getString("data_media_item_id");
                        ArrayList parcelableArrayList = data.getParcelableArrayList("data_media_item_list");
                        Parcelable.Creator<c7.m> creator = c7.m.CREATOR;
                        if (parcelableArrayList != null) {
                            ArrayList arrayList = new ArrayList();
                            for (int i11 = 0; i11 < parcelableArrayList.size(); i11++) {
                                arrayList.add(lc.b.o((Parcelable) parcelableArrayList.get(i11), creator));
                            }
                        }
                        if (jVar.f3645g != messenger) {
                            return;
                        }
                        if (string != null && jVar.f3643e.get(string) != null) {
                            throw new ClassCastException();
                        }
                        if (c7.o.f3673b) {
                            Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (BadParcelableException unused) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    return;
                }
            default:
                super.handleMessage(message);
                return;
        }
    }

    public y1(c7.j jVar) {
        this.f2206b = new WeakReference(jVar);
    }
}
