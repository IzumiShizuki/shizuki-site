.class public final Ls/u;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ls/w;


# direct methods
.method public synthetic constructor <init>(Ls/w;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls/u;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Ls/u;->c:Ls/w;

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
    iget v0, p0, Ls/u;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lp1/b;

    .line 7
    .line 8
    iget-wide v0, p1, Lp1/b;->a:J

    .line 9
    .line 10
    iget-object p1, p0, Ls/u;->c:Ls/w;

    .line 11
    .line 12
    iget-boolean v0, p1, Ls/d;->u:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, Ls/d;->v:Lic/a;

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
    check-cast p1, Lp1/b;

    .line 25
    .line 26
    iget-wide v0, p1, Lp1/b;->a:J

    .line 27
    .line 28
    iget-object p1, p0, Ls/u;->c:Ls/w;

    .line 29
    .line 30
    iget-object v0, p1, Ls/w;->H:Lic/a;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Lic/a;->b()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-boolean v0, p1, Ls/w;->J:Z

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    sget-object v0, Lj2/l1;->l:Lx0/o2;

    .line 42
    .line 43
    invoke-static {p1, v0}, Li2/f;->i(Li2/l;Lx0/m1;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Ly1/a;

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-interface {p1, v0}, Ly1/a;->a(I)V

    .line 51
    .line 52
    .line 53
    :cond_2
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 54
    .line 55
    return-object p1

    .line 56
    :pswitch_1
    check-cast p1, Lp1/b;

    .line 57
    .line 58
    iget-wide v0, p1, Lp1/b;->a:J

    .line 59
    .line 60
    iget-object p1, p0, Ls/u;->c:Ls/w;

    .line 61
    .line 62
    iget-object p1, p1, Ls/w;->I:Lic/a;

    .line 63
    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    invoke-interface {p1}, Lic/a;->b()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    :cond_3
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 70
    .line 71
    return-object p1

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
