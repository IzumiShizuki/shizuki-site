.class public final Ll0/x;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ll0/s0;


# direct methods
.method public synthetic constructor <init>(Ll0/s0;I)V
    .locals 0

    .line 1
    iput p2, p0, Ll0/x;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Ll0/x;->c:Ll0/s0;

    .line 4
    .line 5
    const/4 p1, 0x0

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
.method public final b()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Ll0/x;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll0/x;->c:Ll0/s0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ll0/s0;->i()V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    const/4 v0, 0x1

    .line 15
    iget-object v1, p0, Ll0/x;->c:Ll0/s0;

    .line 16
    .line 17
    iput-boolean v0, v1, Ll0/s0;->s:Z

    .line 18
    .line 19
    invoke-virtual {v1}, Ll0/s0;->p()V

    .line 20
    .line 21
    .line 22
    iget-object v0, v1, Ll0/s0;->p:Lx0/e1;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {v0, v2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, v1, Ll0/s0;->q:Lx0/e1;

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_1
    iget-object v0, p0, Ll0/x;->c:Ll0/s0;

    .line 37
    .line 38
    iget-object v0, v0, Ll0/s0;->o:Lx0/e1;

    .line 39
    .line 40
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Lp1/b;

    .line 45
    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    iget-wide v0, v0, Lp1/b;->a:J

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    :goto_0
    new-instance v2, Lp1/b;

    .line 57
    .line 58
    invoke-direct {v2, v0, v1}, Lp1/b;-><init>(J)V

    .line 59
    .line 60
    .line 61
    return-object v2

    .line 62
    :pswitch_2
    iget-object v0, p0, Ll0/x;->c:Ll0/s0;

    .line 63
    .line 64
    iget-object v0, v0, Ll0/s0;->n:Lx0/e1;

    .line 65
    .line 66
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Lp1/b;

    .line 71
    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    iget-wide v0, v0, Lp1/b;->a:J

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    :goto_1
    new-instance v2, Lp1/b;

    .line 83
    .line 84
    invoke-direct {v2, v0, v1}, Lp1/b;-><init>(J)V

    .line 85
    .line 86
    .line 87
    return-object v2

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method
