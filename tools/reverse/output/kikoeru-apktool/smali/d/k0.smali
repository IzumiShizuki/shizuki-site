.class public final Ld/k0;
.super Ld/b0;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le7/a0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld/k0;->d:I

    iput-object p1, p0, Ld/k0;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 1
    invoke-direct {p0, p1}, Ld/b0;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Lj3/a;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ld/k0;->d:I

    iput-object p1, p0, Ld/k0;->e:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 2
    invoke-direct {p0, p1}, Ld/b0;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    .line 1
    iget v0, p0, Ld/k0;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ld/k0;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Le7/a0;

    .line 9
    .line 10
    invoke-virtual {v0}, Le7/a0;->c()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Ld/k0;->e:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lj3/a;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Lj3/a;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method
