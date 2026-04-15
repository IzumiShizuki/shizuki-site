.class public final synthetic Lz9/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lz9/r;

.field public final synthetic c:Lc9/f;


# direct methods
.method public synthetic constructor <init>(Lz9/r;Lc9/f;I)V
    .locals 0

    .line 1
    iput p3, p0, Lz9/e;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lz9/e;->b:Lz9/r;

    .line 4
    .line 5
    iput-object p2, p0, Lz9/e;->c:Lc9/f;

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
.method public final b()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lz9/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz9/e;->c:Lc9/f;

    .line 7
    .line 8
    iget-object v1, v0, Lc9/f;->f:[B

    .line 9
    .line 10
    new-instance v2, Loc/d;

    .line 11
    .line 12
    const-string v3, "<this>"

    .line 13
    .line 14
    invoke-static {v1, v3}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    array-length v3, v1

    .line 18
    const/4 v4, 0x1

    .line 19
    sub-int/2addr v3, v4

    .line 20
    const/16 v5, 0x32

    .line 21
    .line 22
    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v5, 0x0

    .line 27
    invoke-direct {v2, v5, v3, v4}, Loc/b;-><init>(III)V

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2}, Lvb/l;->J0([BLoc/d;)[B

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v2, p0, Lz9/e;->b:Lz9/r;

    .line 35
    .line 36
    iget-object v3, v2, Lz9/r;->i:Lx0/e1;

    .line 37
    .line 38
    invoke-virtual {v3, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, v0, Lc9/f;->g:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v1, v2, Lz9/r;->h:Lx0/e1;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput-boolean v5, v2, Lz9/r;->j:Z

    .line 49
    .line 50
    invoke-virtual {v2, v4}, Lz9/r;->G(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v5}, Lz9/r;->H(Z)V

    .line 54
    .line 55
    .line 56
    :goto_0
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_0
    iget-object v0, p0, Lz9/e;->c:Lc9/f;

    .line 60
    .line 61
    iget-object v1, v0, Lc9/f;->d:[B

    .line 62
    .line 63
    const-string v2, "<set-?>"

    .line 64
    .line 65
    invoke-static {v1, v2}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-object v2, p0, Lz9/e;->b:Lz9/r;

    .line 69
    .line 70
    iget-object v3, v2, Lz9/r;->i:Lx0/e1;

    .line 71
    .line 72
    invoke-virtual {v3, v1}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object v0, v0, Lc9/f;->e:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v1, v2, Lz9/r;->h:Lx0/e1;

    .line 78
    .line 79
    invoke-virtual {v1, v0}, Lx0/e1;->setValue(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    const/4 v0, 0x1

    .line 83
    iput-boolean v0, v2, Lz9/r;->j:Z

    .line 84
    .line 85
    invoke-virtual {v2, v0}, Lz9/r;->G(Z)V

    .line 86
    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    invoke-virtual {v2, v0}, Lz9/r;->H(Z)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

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
.end method
