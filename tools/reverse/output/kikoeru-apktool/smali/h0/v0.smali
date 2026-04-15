.class public final Lh0/v0;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lh0/c1;


# direct methods
.method public synthetic constructor <init>(Lh0/c1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lh0/v0;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lh0/v0;->c:Lh0/c1;

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
    .locals 3

    .line 1
    iget v0, p0, Lh0/v0;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lc2/t;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p1, v0}, Lc2/s;->f(Lc2/t;Z)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-object v2, p0, Lh0/v0;->c:Lh0/c1;

    .line 14
    .line 15
    invoke-interface {v2, v0, v1}, Lh0/c1;->e(J)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lc2/t;->a()V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    check-cast p1, Lp1/b;

    .line 25
    .line 26
    iget-wide v0, p1, Lp1/b;->a:J

    .line 27
    .line 28
    iget-object p1, p0, Lh0/v0;->c:Lh0/c1;

    .line 29
    .line 30
    invoke-interface {p1, v0, v1}, Lh0/c1;->a(J)V

    .line 31
    .line 32
    .line 33
    sget-object p1, Lub/a0;->a:Lub/a0;

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
