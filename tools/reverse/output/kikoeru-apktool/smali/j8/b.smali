.class public final Lj8/b;
.super Llh/o;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic b:I

.field public c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Llh/h0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lj8/b;->b:I

    invoke-direct {p0, p1}, Llh/o;-><init>(Llh/h0;)V

    return-void
.end method

.method public constructor <init>(Llh/h0;Lug/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lj8/b;->b:I

    iput-object p2, p0, Lj8/b;->c:Ljava/lang/Object;

    .line 2
    invoke-direct {p0, p1}, Llh/o;-><init>(Llh/h0;)V

    return-void
.end method


# virtual methods
.method public W(Llh/f;J)J
    .locals 1

    .line 1
    iget v0, p0, Lj8/b;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Llh/o;->W(Llh/f;J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    return-wide p1

    .line 11
    :pswitch_0
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Llh/o;->W(Llh/f;J)J

    .line 12
    .line 13
    .line 14
    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return-wide p1

    .line 16
    :catch_0
    move-exception p1

    .line 17
    iput-object p1, p0, Lj8/b;->c:Ljava/lang/Object;

    .line 18
    .line 19
    throw p1

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public close()V
    .locals 1

    .line 1
    iget v0, p0, Lj8/b;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Llh/o;->close()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, Lj8/b;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lug/c;

    .line 13
    .line 14
    iget-object v0, v0, Lug/c;->b:Lxg/d;

    .line 15
    .line 16
    invoke-virtual {v0}, Lxg/d;->close()V

    .line 17
    .line 18
    .line 19
    invoke-super {p0}, Llh/o;->close()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
