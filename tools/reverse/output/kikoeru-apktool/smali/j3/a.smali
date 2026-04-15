.class public final Lj3/a;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lj3/s;


# direct methods
.method public synthetic constructor <init>(Lj3/s;I)V
    .locals 0

    .line 1
    iput p2, p0, Lj3/a;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lj3/a;->c:Lj3/s;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
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


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lj3/a;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ld/b0;

    .line 7
    .line 8
    iget-object p1, p0, Lj3/a;->c:Lj3/s;

    .line 9
    .line 10
    iget-object v0, p1, Lj3/s;->e:Lj3/q;

    .line 11
    .line 12
    iget-boolean v0, v0, Lj3/q;->a:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, Lj3/s;->d:Lic/a;

    .line 17
    .line 18
    invoke-interface {p1}, Lic/a;->b()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    check-cast p1, Lx0/f0;

    .line 25
    .line 26
    new-instance p1, Lb0/h0;

    .line 27
    .line 28
    const/16 v0, 0xa

    .line 29
    .line 30
    iget-object v1, p0, Lj3/a;->c:Lj3/s;

    .line 31
    .line 32
    invoke-direct {p1, v0, v1}, Lb0/h0;-><init>(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
