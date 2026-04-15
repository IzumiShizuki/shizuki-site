.class public final synthetic Ld9/k;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ld9/m;

.field public final synthetic c:Lc9/c;


# direct methods
.method public synthetic constructor <init>(Ld9/m;Lc9/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Ld9/k;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ld9/k;->b:Ld9/m;

    .line 4
    .line 5
    iput-object p2, p0, Ld9/k;->c:Lc9/c;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ld9/k;->a:I

    .line 2
    .line 3
    check-cast p1, Lz7/a;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string v0, "_connection"

    .line 9
    .line 10
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ld9/k;->b:Ld9/m;

    .line 14
    .line 15
    iget-object v0, v0, Ld9/m;->c:Ld9/d;

    .line 16
    .line 17
    iget-object v1, p0, Ld9/k;->c:Lc9/c;

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1}, Ln7/d;->u(Lz7/a;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 23
    .line 24
    return-object p1

    .line 25
    :pswitch_0
    const-string v0, "_connection"

    .line 26
    .line 27
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Ld9/k;->b:Ld9/m;

    .line 31
    .line 32
    iget-object v0, v0, Ld9/m;->b:Ld9/c;

    .line 33
    .line 34
    iget-object v1, p0, Ld9/k;->c:Lc9/c;

    .line 35
    .line 36
    invoke-virtual {v0, p1, v1}, Ln7/e;->w(Lz7/a;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_1
    const-string v0, "<unused var>"

    .line 41
    .line 42
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Ld9/k;->c:Lc9/c;

    .line 46
    .line 47
    iget-wide v0, p1, Lc9/c;->c:J

    .line 48
    .line 49
    iget-object v2, p0, Ld9/k;->b:Ld9/m;

    .line 50
    .line 51
    iget-object v3, v2, Ld9/m;->a:Ln7/v;

    .line 52
    .line 53
    new-instance v4, Ld9/l;

    .line 54
    .line 55
    const/4 v5, 0x1

    .line 56
    invoke-direct {v4, v0, v1, v5}, Ld9/l;-><init>(JI)V

    .line 57
    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-static {v3, v0, v1, v4}, Lua/l;->W(Ln7/v;ZZLic/k;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Lc9/c;

    .line 66
    .line 67
    if-eqz v4, :cond_0

    .line 68
    .line 69
    iget v0, v4, Lc9/c;->a:I

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    const/16 v3, 0x1ffe

    .line 73
    .line 74
    invoke-static {p1, v0, v1, v3}, Lc9/c;->a(Lc9/c;ILjava/lang/String;I)Lc9/c;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {v2, p1}, Ld9/m;->b(Lc9/c;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_0
    new-instance v4, Ld9/k;

    .line 83
    .line 84
    const/4 v5, 0x1

    .line 85
    invoke-direct {v4, v2, p1, v5}, Ld9/k;-><init>(Ld9/m;Lc9/c;I)V

    .line 86
    .line 87
    .line 88
    invoke-static {v3, v1, v0, v4}, Lua/l;->W(Ln7/v;ZZLic/k;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 92
    .line 93
    return-object p1

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
