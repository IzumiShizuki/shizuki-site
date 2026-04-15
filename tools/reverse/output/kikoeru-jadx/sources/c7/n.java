package c7;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Messenger f3672a;

    public n(Messenger messenger) {
        this.f3672a = messenger;
    }

    public void a(d1 d1Var, Bundle bundle) throws RemoteException {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("extra_service_version", 2);
        Bundle bundle2 = new Bundle();
        bundle2.putString("data_media_item_id", "androidx.media3.session.MediaLibraryService");
        bundle2.putParcelable("data_media_session_token", lc.b.o(d1Var, MediaSessionCompat$Token.CREATOR));
        bundle2.putBundle("data_root_hints", bundle);
        b(1, bundle2);
    }

    public void b(int i10, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        messageObtain.arg1 = 2;
        if (bundle != null) {
            messageObtain.setData(bundle);
        }
        this.f3672a.send(messageObtain);
    }

    public void c(int i10, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        messageObtain.arg1 = 1;
        if (bundle != null) {
            messageObtain.setData(bundle);
        }
        messageObtain.replyTo = messenger;
        this.f3672a.send(messageObtain);
    }
}
