.class public final synthetic Lka/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lka/g;


# direct methods
.method public synthetic constructor <init>(Lka/g;I)V
    .locals 0

    .line 1
    iput p2, p0, Lka/c;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lka/c;->b:Lka/g;

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
.method public final b()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lka/c;->a:I

    .line 2
    .line 3
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 4
    .line 5
    iget-object v2, p0, Lka/c;->b:Lka/g;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, Lna/v;->a:Lna/v;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    sget v0, Lff/a;->d:I

    .line 20
    .line 21
    const/4 v0, 0x7

    .line 22
    sget-object v5, Lff/c;->g:Lff/c;

    .line 23
    .line 24
    invoke-static {v0, v5}, Lff/f;->m(ILff/c;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    invoke-static {v5, v6}, Lff/a;->d(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    add-long/2addr v5, v3

    .line 33
    sget-object v0, Lna/v;->d:Lhg/b;

    .line 34
    .line 35
    sget-object v3, Lna/v;->b:[Lpc/u;

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    aget-object v3, v3, v4

    .line 39
    .line 40
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v0, v4, v3}, Lhg/b;->e(Ljava/lang/Object;Lpc/u;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v2}, Lka/j;->c(Lka/g;)V

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :pswitch_0
    iget-object v0, v2, Lka/g;->d:Lic/k;

    .line 52
    .line 53
    invoke-interface {v0, v2}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    invoke-static {v2}, Lka/j;->c(Lka/g;)V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :pswitch_1
    invoke-static {v2}, Lka/j;->c(Lka/g;)V

    .line 61
    .line 62
    .line 63
    return-object v1

    .line 64
    :pswitch_2
    invoke-static {v2}, Lka/j;->c(Lka/g;)V

    .line 65
    .line 66
    .line 67
    return-object v1

    .line 68
    :pswitch_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {v2}, Lka/j;->c(Lka/g;)V

    .line 72
    .line 73
    .line 74
    return-object v1

    .line 75
    :pswitch_4
    iget-object v0, v2, Lka/g;->d:Lic/k;

    .line 76
    .line 77
    invoke-interface {v0, v2}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    invoke-static {v2}, Lka/j;->c(Lka/g;)V

    .line 81
    .line 82
    .line 83
    return-object v1

    .line 84
    :pswitch_5
    invoke-static {v2}, Lka/j;->c(Lka/g;)V

    .line 85
    .line 86
    .line 87
    return-object v1

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
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
