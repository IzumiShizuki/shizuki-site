.class public final Lla/q0;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Lfg/f;


# direct methods
.method public synthetic constructor <init>(Lfg/f;Lyb/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lla/q0;->e:I

    .line 2
    .line 3
    iput-object p1, p0, Lla/q0;->f:Lfg/f;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lac/i;-><init>(ILyb/c;)V

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
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 2

    .line 1
    iget p1, p0, Lla/q0;->e:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lla/q0;

    .line 7
    .line 8
    iget-object v0, p0, Lla/q0;->f:Lfg/f;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {p1, v0, p2, v1}, Lla/q0;-><init>(Lfg/f;Lyb/c;I)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, Lla/q0;

    .line 16
    .line 17
    iget-object v0, p0, Lla/q0;->f:Lfg/f;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, v0, p2, v1}, Lla/q0;-><init>(Lfg/f;Lyb/c;I)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lla/q0;->e:I

    .line 2
    .line 3
    check-cast p1, Lhf/y;

    .line 4
    .line 5
    check-cast p2, Lyb/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lla/q0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lla/q0;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lla/q0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lla/q0;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lla/q0;

    .line 27
    .line 28
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lla/q0;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-object p2

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lla/q0;->e:I

    .line 2
    .line 3
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 4
    .line 5
    iget-object v2, p0, Lla/q0;->f:Lfg/f;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, Lv9/b;->a:Lub/p;

    .line 14
    .line 15
    invoke-virtual {v2}, Lfg/f;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    new-instance v5, Lfg/d;

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    invoke-direct {v5, v2, p1}, Lfg/d;-><init>(Lfg/f;I)V

    .line 31
    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    const/16 v8, 0x1f4

    .line 35
    .line 36
    const-string v3, "\u672c\u9875\u9762\u5185\u5bb9\u6d89\u53ca\u5371\u9669\u64cd\u4f5c\uff0c\u8bf7\u8c28\u614e\u64cd\u4f5c\u3002\u5bfc\u51fa\u7684\u6570\u636e\u5e93\u5305\u542b\u8d26\u53f7\u5bc6\u7801\u7b49\u654f\u611f\u4fe1\u606f\uff0c\u8bf7\u59a5\u5584\u4fdd\u5b58\u3002"

    .line 37
    .line 38
    const-string v4, "\u8b66\u544a"

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    invoke-static/range {v3 .. v8}, Lka/j;->d(Ljava/lang/String;Ljava/lang/String;Lic/k;Lj3/q;Lf1/f;I)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-object v1

    .line 45
    :pswitch_0
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2}, Lfg/f;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    const p1, 0x7f0c00cc

    .line 61
    .line 62
    .line 63
    invoke-static {p1}, Lna/q;->g(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const p1, 0x7f0c00cd

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Lna/q;->g(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    new-instance v6, Lj3/q;

    .line 75
    .line 76
    const/4 p1, 0x4

    .line 77
    invoke-direct {v6, p1}, Lj3/q;-><init>(I)V

    .line 78
    .line 79
    .line 80
    new-instance v5, Lfg/d;

    .line 81
    .line 82
    const/4 p1, 0x1

    .line 83
    invoke-direct {v5, v2, p1}, Lfg/d;-><init>(Lfg/f;I)V

    .line 84
    .line 85
    .line 86
    const/4 v7, 0x0

    .line 87
    const/16 v8, 0x1bc

    .line 88
    .line 89
    invoke-static/range {v3 .. v8}, Lka/j;->d(Ljava/lang/String;Ljava/lang/String;Lic/k;Lj3/q;Lf1/f;I)V

    .line 90
    .line 91
    .line 92
    :cond_1
    return-object v1

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
