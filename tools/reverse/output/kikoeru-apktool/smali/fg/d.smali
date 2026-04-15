.class public final synthetic Lfg/d;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lfg/f;


# direct methods
.method public synthetic constructor <init>(Lfg/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Lfg/d;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lfg/d;->b:Lfg/f;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
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
    .locals 4

    .line 1
    iget v0, p0, Lfg/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lfg/d;->b:Lfg/f;

    .line 7
    .line 8
    check-cast p1, Lka/g;

    .line 9
    .line 10
    sget-object v1, Lv9/b;->a:Lub/p;

    .line 11
    .line 12
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lfg/f;->setValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lka/j;->c(Lka/g;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 21
    .line 22
    return-object p1

    .line 23
    :pswitch_0
    iget-object v0, p0, Lfg/d;->b:Lfg/f;

    .line 24
    .line 25
    check-cast p1, Lka/g;

    .line 26
    .line 27
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lfg/f;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_1
    iget-object v0, p0, Lfg/d;->b:Lfg/f;

    .line 34
    .line 35
    const-string v1, "null cannot be cast to non-null type T of loli.ball.okkv.OkkvStateImpl"

    .line 36
    .line 37
    invoke-static {p1, v1}, Ljc/l;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, v0, Lfg/f;->b:Lfg/e;

    .line 41
    .line 42
    invoke-static {v1}, Lh1/n;->i(Lh1/g0;)Lh1/g0;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Lfg/e;

    .line 47
    .line 48
    iget-object v1, v1, Lfg/e;->c:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-static {v1, p1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_0

    .line 55
    .line 56
    iget-object v1, v0, Lfg/f;->b:Lfg/e;

    .line 57
    .line 58
    sget-object v2, Lh1/n;->c:Ljava/lang/Object;

    .line 59
    .line 60
    monitor-enter v2

    .line 61
    :try_start_0
    invoke-static {}, Lh1/n;->k()Lh1/g;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {v1, v0, v3}, Lh1/n;->x(Lh1/g0;Lh1/e0;Lh1/g;)Lh1/g0;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Lfg/e;

    .line 70
    .line 71
    iput-object p1, v1, Lfg/e;->c:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    monitor-exit v2

    .line 74
    invoke-static {v3, v0}, Lh1/n;->o(Lh1/g;Lh1/e0;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catchall_0
    move-exception p1

    .line 79
    monitor-exit v2

    .line 80
    throw p1

    .line 81
    :cond_0
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 82
    .line 83
    return-object p1

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
