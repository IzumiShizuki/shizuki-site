.class public final Lb0/y;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    .line 1
    iput p4, p0, Lb0/y;->b:I

    .line 2
    .line 3
    iput-object p1, p0, Lb0/y;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iput-wide p2, p0, Lb0/y;->c:J

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
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
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lb0/y;->b:I

    .line 2
    .line 3
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 4
    .line 5
    iget-object v2, p0, Lb0/y;->d:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object v3, p1

    .line 11
    check-cast v3, Ls1/d;

    .line 12
    .line 13
    check-cast v2, Lh0/u0;

    .line 14
    .line 15
    iget-object p1, v2, Lh0/u0;->s:Lx0/e1;

    .line 16
    .line 17
    invoke-virtual {p1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    iget-object p1, v2, Lh0/u0;->t:Lx0/e1;

    .line 30
    .line 31
    invoke-virtual {p1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    :cond_0
    const/4 v8, 0x0

    .line 44
    const/16 v9, 0x7e

    .line 45
    .line 46
    iget-wide v4, p0, Lb0/y;->c:J

    .line 47
    .line 48
    const-wide/16 v6, 0x0

    .line 49
    .line 50
    invoke-static/range {v3 .. v9}, Lq/t0;->q(Ls1/d;JJFI)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-object v1

    .line 54
    :pswitch_0
    check-cast p1, Lr/c;

    .line 55
    .line 56
    check-cast v2, Lb0/a0;

    .line 57
    .line 58
    invoke-virtual {p1}, Lr/c;->e()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Lf3/j;

    .line 63
    .line 64
    iget-wide v3, p1, Lf3/j;->a:J

    .line 65
    .line 66
    iget-wide v5, p0, Lb0/y;->c:J

    .line 67
    .line 68
    invoke-static {v3, v4, v5, v6}, Lf3/j;->c(JJ)J

    .line 69
    .line 70
    .line 71
    move-result-wide v3

    .line 72
    sget p1, Lb0/a0;->t:I

    .line 73
    .line 74
    invoke-virtual {v2, v3, v4}, Lb0/a0;->g(J)V

    .line 75
    .line 76
    .line 77
    iget-object p1, v2, Lb0/a0;->c:Lb0/d0;

    .line 78
    .line 79
    invoke-virtual {p1}, Lb0/d0;->b()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    return-object v1

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
