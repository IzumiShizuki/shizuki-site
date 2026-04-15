.class public final Lj5/n1;
.super Lj5/s;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm4/i1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lj5/n1;->f:I

    .line 3
    invoke-direct {p0, p1}, Lj5/s;-><init>(Lm4/i1;)V

    .line 4
    new-instance p1, Lm4/h1;

    invoke-direct {p1}, Lm4/h1;-><init>()V

    iput-object p1, p0, Lj5/n1;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm4/i1;Lm4/i0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lj5/n1;->f:I

    .line 1
    invoke-direct {p0, p1}, Lj5/s;-><init>(Lm4/i1;)V

    .line 2
    iput-object p2, p0, Lj5/n1;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public f(ILm4/f1;Z)Lm4/f1;
    .locals 11

    .line 1
    iget v0, p0, Lj5/n1;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Lj5/s;->f(ILm4/f1;Z)Lm4/f1;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    iget-object v0, p0, Lj5/s;->e:Lm4/i1;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3}, Lm4/i1;->f(ILm4/f1;Z)Lm4/f1;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget p1, v1, Lm4/f1;->c:I

    .line 18
    .line 19
    iget-object p3, p0, Lj5/n1;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p3, Lm4/h1;

    .line 22
    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    invoke-virtual {v0, p1, p3, v2, v3}, Lm4/i1;->m(ILm4/h1;J)Lm4/h1;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lm4/h1;->a()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    iget-object v2, p2, Lm4/f1;->a:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v3, p2, Lm4/f1;->b:Ljava/lang/Object;

    .line 38
    .line 39
    iget v4, p2, Lm4/f1;->c:I

    .line 40
    .line 41
    iget-wide v5, p2, Lm4/f1;->d:J

    .line 42
    .line 43
    iget-wide v7, p2, Lm4/f1;->e:J

    .line 44
    .line 45
    sget-object v9, Lm4/b;->f:Lm4/b;

    .line 46
    .line 47
    const/4 v10, 0x1

    .line 48
    invoke-virtual/range {v1 .. v10}, Lm4/f1;->i(Ljava/lang/Object;Ljava/lang/Object;IJJLm4/b;Z)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 p1, 0x1

    .line 53
    iput-boolean p1, v1, Lm4/f1;->f:Z

    .line 54
    .line 55
    :goto_0
    return-object v1

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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

.method public m(ILm4/h1;J)Lm4/h1;
    .locals 1

    .line 1
    iget v0, p0, Lj5/n1;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Lj5/s;->m(ILm4/h1;J)Lm4/h1;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    invoke-super {p0, p1, p2, p3, p4}, Lj5/s;->m(ILm4/h1;J)Lm4/h1;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lj5/n1;->g:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Lm4/i0;

    .line 17
    .line 18
    iput-object p1, p2, Lm4/h1;->c:Lm4/i0;

    .line 19
    .line 20
    iget-object p1, p1, Lm4/i0;->b:Lm4/d0;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    return-object p2

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
