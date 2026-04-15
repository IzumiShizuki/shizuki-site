.class public final Lwd/q;
.super Lce/k;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lce/x;


# instance fields
.field public final synthetic b:I

.field public c:I

.field public d:Ljava/io/Serializable;

.field public e:Ljava/lang/Object;

.field public f:Lce/p;

.field public g:Ljava/io/Serializable;

.field public h:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lwd/q;->b:I

    .line 2
    .line 3
    invoke-direct {p0}, Lce/k;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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
.end method

.method public static h()Lwd/q;
    .locals 2

    .line 1
    new-instance v0, Lwd/q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lwd/q;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lwd/s;->b:Lwd/s;

    .line 8
    .line 9
    iput-object v1, v0, Lwd/q;->d:Ljava/io/Serializable;

    .line 10
    .line 11
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 12
    .line 13
    iput-object v1, v0, Lwd/q;->e:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object v1, Lwd/z;->l:Lwd/z;

    .line 16
    .line 17
    iput-object v1, v0, Lwd/q;->f:Lce/p;

    .line 18
    .line 19
    sget-object v1, Lwd/t;->b:Lwd/t;

    .line 20
    .line 21
    iput-object v1, v0, Lwd/q;->g:Ljava/io/Serializable;

    .line 22
    .line 23
    sget-object v1, Lwd/r;->b:Lwd/r;

    .line 24
    .line 25
    iput-object v1, v0, Lwd/q;->h:Ljava/io/Serializable;

    .line 26
    .line 27
    return-object v0
    .line 28
    .line 29
.end method

.method public static i()Lwd/q;
    .locals 2

    .line 1
    new-instance v0, Lwd/q;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lwd/q;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lzd/b;->g:Lzd/b;

    .line 8
    .line 9
    iput-object v1, v0, Lwd/q;->d:Ljava/io/Serializable;

    .line 10
    .line 11
    sget-object v1, Lzd/c;->g:Lzd/c;

    .line 12
    .line 13
    iput-object v1, v0, Lwd/q;->e:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object v1, v0, Lwd/q;->f:Lce/p;

    .line 16
    .line 17
    iput-object v1, v0, Lwd/q;->g:Ljava/io/Serializable;

    .line 18
    .line 19
    iput-object v1, v0, Lwd/q;->h:Ljava/io/Serializable;

    .line 20
    .line 21
    return-object v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final c()Lce/b;
    .locals 2

    .line 1
    iget v0, p0, Lwd/q;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lwd/q;->g()Lzd/d;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lzd/d;->b()Z

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    invoke-virtual {p0}, Lwd/q;->f()Lwd/u;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lwd/u;->b()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    new-instance v0, Lce/j0;

    .line 26
    .line 27
    invoke-direct {v0}, Lce/j0;-><init>()V

    .line 28
    .line 29
    .line 30
    throw v0

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lwd/q;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lwd/q;->i()Lwd/q;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lwd/q;->g()Lzd/d;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Lwd/q;->k(Lzd/d;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    invoke-static {}, Lwd/q;->h()Lwd/q;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p0}, Lwd/q;->f()Lwd/u;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Lwd/q;->j(Lwd/u;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public final d(Lce/f;Lce/i;)Lce/k;
    .locals 2

    .line 1
    iget v0, p0, Lwd/q;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :try_start_0
    sget-object v1, Lzd/d;->k:Lwd/a;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v1, Lzd/d;

    .line 13
    .line 14
    invoke-direct {v1, p1, p2}, Lzd/d;-><init>(Lce/f;Lce/i;)V
    :try_end_0
    .catch Lce/s; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lwd/q;->k(Lzd/d;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_0

    .line 23
    :catch_0
    move-exception p1

    .line 24
    :try_start_1
    iget-object p2, p1, Lce/s;->a:Lce/b;

    .line 25
    .line 26
    check-cast p2, Lzd/d;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 29
    :catchall_1
    move-exception p1

    .line 30
    move-object v0, p2

    .line 31
    :goto_0
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lwd/q;->k(Lzd/d;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    throw p1

    .line 37
    :pswitch_0
    const/4 v0, 0x0

    .line 38
    :try_start_3
    sget-object v1, Lwd/u;->k:Lwd/a;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v1, Lwd/u;

    .line 44
    .line 45
    invoke-direct {v1, p1, p2}, Lwd/u;-><init>(Lce/f;Lce/i;)V
    :try_end_3
    .catch Lce/s; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v1}, Lwd/q;->j(Lwd/u;)V

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :catchall_2
    move-exception p1

    .line 53
    goto :goto_1

    .line 54
    :catch_1
    move-exception p1

    .line 55
    :try_start_4
    iget-object p2, p1, Lce/s;->a:Lce/b;

    .line 56
    .line 57
    check-cast p2, Lwd/u;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 58
    .line 59
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 60
    :catchall_3
    move-exception p1

    .line 61
    move-object v0, p2

    .line 62
    :goto_1
    if-eqz v0, :cond_1

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lwd/q;->j(Lwd/u;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    throw p1

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public final bridge synthetic e(Lce/p;)Lce/k;
    .locals 1

    .line 1
    iget v0, p0, Lwd/q;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lzd/d;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lwd/q;->k(Lzd/d;)V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_0
    check-cast p1, Lwd/u;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lwd/q;->j(Lwd/u;)V

    .line 15
    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
.end method

.method public f()Lwd/u;
    .locals 5

    .line 1
    new-instance v0, Lwd/u;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lwd/u;-><init>(Lwd/q;)V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lwd/q;->c:I

    .line 7
    .line 8
    and-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v3, 0x0

    .line 15
    :goto_0
    iget-object v2, p0, Lwd/q;->d:Ljava/io/Serializable;

    .line 16
    .line 17
    check-cast v2, Lwd/s;

    .line 18
    .line 19
    iput-object v2, v0, Lwd/u;->c:Lwd/s;

    .line 20
    .line 21
    and-int/lit8 v2, v1, 0x2

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    if-ne v2, v4, :cond_1

    .line 25
    .line 26
    iget-object v2, p0, Lwd/q;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iput-object v2, p0, Lwd/q;->e:Ljava/lang/Object;

    .line 35
    .line 36
    iget v2, p0, Lwd/q;->c:I

    .line 37
    .line 38
    and-int/lit8 v2, v2, -0x3

    .line 39
    .line 40
    iput v2, p0, Lwd/q;->c:I

    .line 41
    .line 42
    :cond_1
    iget-object v2, p0, Lwd/q;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Ljava/util/List;

    .line 45
    .line 46
    iput-object v2, v0, Lwd/u;->d:Ljava/util/List;

    .line 47
    .line 48
    and-int/lit8 v2, v1, 0x4

    .line 49
    .line 50
    const/4 v4, 0x4

    .line 51
    if-ne v2, v4, :cond_2

    .line 52
    .line 53
    or-int/lit8 v3, v3, 0x2

    .line 54
    .line 55
    :cond_2
    iget-object v2, p0, Lwd/q;->f:Lce/p;

    .line 56
    .line 57
    check-cast v2, Lwd/z;

    .line 58
    .line 59
    iput-object v2, v0, Lwd/u;->e:Lwd/z;

    .line 60
    .line 61
    and-int/lit8 v2, v1, 0x8

    .line 62
    .line 63
    const/16 v4, 0x8

    .line 64
    .line 65
    if-ne v2, v4, :cond_3

    .line 66
    .line 67
    or-int/lit8 v3, v3, 0x4

    .line 68
    .line 69
    :cond_3
    iget-object v2, p0, Lwd/q;->g:Ljava/io/Serializable;

    .line 70
    .line 71
    check-cast v2, Lwd/t;

    .line 72
    .line 73
    iput-object v2, v0, Lwd/u;->f:Lwd/t;

    .line 74
    .line 75
    const/16 v2, 0x10

    .line 76
    .line 77
    and-int/2addr v1, v2

    .line 78
    if-ne v1, v2, :cond_4

    .line 79
    .line 80
    or-int/lit8 v3, v3, 0x8

    .line 81
    .line 82
    :cond_4
    iget-object v1, p0, Lwd/q;->h:Ljava/io/Serializable;

    .line 83
    .line 84
    check-cast v1, Lwd/r;

    .line 85
    .line 86
    iput-object v1, v0, Lwd/u;->g:Lwd/r;

    .line 87
    .line 88
    iput v3, v0, Lwd/u;->b:I

    .line 89
    .line 90
    return-object v0
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method

.method public g()Lzd/d;
    .locals 5

    .line 1
    new-instance v0, Lzd/d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lzd/d;-><init>(Lwd/q;)V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lwd/q;->c:I

    .line 7
    .line 8
    and-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v3, 0x0

    .line 15
    :goto_0
    iget-object v2, p0, Lwd/q;->d:Ljava/io/Serializable;

    .line 16
    .line 17
    check-cast v2, Lzd/b;

    .line 18
    .line 19
    iput-object v2, v0, Lzd/d;->c:Lzd/b;

    .line 20
    .line 21
    and-int/lit8 v2, v1, 0x2

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    if-ne v2, v4, :cond_1

    .line 25
    .line 26
    or-int/lit8 v3, v3, 0x2

    .line 27
    .line 28
    :cond_1
    iget-object v2, p0, Lwd/q;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Lzd/c;

    .line 31
    .line 32
    iput-object v2, v0, Lzd/d;->d:Lzd/c;

    .line 33
    .line 34
    and-int/lit8 v2, v1, 0x4

    .line 35
    .line 36
    const/4 v4, 0x4

    .line 37
    if-ne v2, v4, :cond_2

    .line 38
    .line 39
    or-int/lit8 v3, v3, 0x4

    .line 40
    .line 41
    :cond_2
    iget-object v2, p0, Lwd/q;->f:Lce/p;

    .line 42
    .line 43
    check-cast v2, Lzd/c;

    .line 44
    .line 45
    iput-object v2, v0, Lzd/d;->e:Lzd/c;

    .line 46
    .line 47
    and-int/lit8 v2, v1, 0x8

    .line 48
    .line 49
    const/16 v4, 0x8

    .line 50
    .line 51
    if-ne v2, v4, :cond_3

    .line 52
    .line 53
    or-int/lit8 v3, v3, 0x8

    .line 54
    .line 55
    :cond_3
    iget-object v2, p0, Lwd/q;->g:Ljava/io/Serializable;

    .line 56
    .line 57
    check-cast v2, Lzd/c;

    .line 58
    .line 59
    iput-object v2, v0, Lzd/d;->f:Lzd/c;

    .line 60
    .line 61
    const/16 v2, 0x10

    .line 62
    .line 63
    and-int/2addr v1, v2

    .line 64
    if-ne v1, v2, :cond_4

    .line 65
    .line 66
    or-int/lit8 v3, v3, 0x10

    .line 67
    .line 68
    :cond_4
    iget-object v1, p0, Lwd/q;->h:Ljava/io/Serializable;

    .line 69
    .line 70
    check-cast v1, Lzd/c;

    .line 71
    .line 72
    iput-object v1, v0, Lzd/d;->g:Lzd/c;

    .line 73
    .line 74
    iput v3, v0, Lzd/d;->b:I

    .line 75
    .line 76
    return-object v0
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
.end method

.method public j(Lwd/u;)V
    .locals 4

    .line 1
    sget-object v0, Lwd/u;->j:Lwd/u;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p1, Lwd/u;->b:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    and-int/2addr v0, v1

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    iget-object v0, p1, Lwd/u;->c:Lwd/s;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget v2, p0, Lwd/q;->c:I

    .line 18
    .line 19
    or-int/2addr v1, v2

    .line 20
    iput v1, p0, Lwd/q;->c:I

    .line 21
    .line 22
    iput-object v0, p0, Lwd/q;->d:Ljava/io/Serializable;

    .line 23
    .line 24
    :cond_1
    iget-object v0, p1, Lwd/u;->d:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x2

    .line 31
    if-nez v0, :cond_4

    .line 32
    .line 33
    iget-object v0, p0, Lwd/q;->e:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    iget-object v0, p1, Lwd/u;->d:Ljava/util/List;

    .line 44
    .line 45
    iput-object v0, p0, Lwd/q;->e:Ljava/lang/Object;

    .line 46
    .line 47
    iget v0, p0, Lwd/q;->c:I

    .line 48
    .line 49
    and-int/lit8 v0, v0, -0x3

    .line 50
    .line 51
    iput v0, p0, Lwd/q;->c:I

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    iget v0, p0, Lwd/q;->c:I

    .line 55
    .line 56
    and-int/2addr v0, v1

    .line 57
    if-eq v0, v1, :cond_3

    .line 58
    .line 59
    new-instance v0, Ljava/util/ArrayList;

    .line 60
    .line 61
    iget-object v2, p0, Lwd/q;->e:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Ljava/util/List;

    .line 64
    .line 65
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, Lwd/q;->e:Ljava/lang/Object;

    .line 69
    .line 70
    iget v0, p0, Lwd/q;->c:I

    .line 71
    .line 72
    or-int/2addr v0, v1

    .line 73
    iput v0, p0, Lwd/q;->c:I

    .line 74
    .line 75
    :cond_3
    iget-object v0, p0, Lwd/q;->e:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Ljava/util/List;

    .line 78
    .line 79
    iget-object v2, p1, Lwd/u;->d:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 82
    .line 83
    .line 84
    :cond_4
    :goto_0
    iget v0, p1, Lwd/u;->b:I

    .line 85
    .line 86
    and-int/2addr v0, v1

    .line 87
    const/4 v2, 0x4

    .line 88
    if-ne v0, v1, :cond_6

    .line 89
    .line 90
    iget-object v0, p1, Lwd/u;->e:Lwd/z;

    .line 91
    .line 92
    iget v1, p0, Lwd/q;->c:I

    .line 93
    .line 94
    and-int/2addr v1, v2

    .line 95
    if-ne v1, v2, :cond_5

    .line 96
    .line 97
    iget-object v1, p0, Lwd/q;->f:Lce/p;

    .line 98
    .line 99
    check-cast v1, Lwd/z;

    .line 100
    .line 101
    sget-object v3, Lwd/z;->l:Lwd/z;

    .line 102
    .line 103
    if-eq v1, v3, :cond_5

    .line 104
    .line 105
    invoke-static {}, Lwd/x;->g()Lwd/x;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v3, v1}, Lwd/x;->h(Lwd/z;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v0}, Lwd/x;->h(Lwd/z;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Lwd/x;->f()Lwd/z;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iput-object v0, p0, Lwd/q;->f:Lce/p;

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_5
    iput-object v0, p0, Lwd/q;->f:Lce/p;

    .line 123
    .line 124
    :goto_1
    iget v0, p0, Lwd/q;->c:I

    .line 125
    .line 126
    or-int/2addr v0, v2

    .line 127
    iput v0, p0, Lwd/q;->c:I

    .line 128
    .line 129
    :cond_6
    iget v0, p1, Lwd/u;->b:I

    .line 130
    .line 131
    and-int/2addr v0, v2

    .line 132
    const/16 v1, 0x8

    .line 133
    .line 134
    if-ne v0, v2, :cond_7

    .line 135
    .line 136
    iget-object v0, p1, Lwd/u;->f:Lwd/t;

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget v2, p0, Lwd/q;->c:I

    .line 142
    .line 143
    or-int/2addr v2, v1

    .line 144
    iput v2, p0, Lwd/q;->c:I

    .line 145
    .line 146
    iput-object v0, p0, Lwd/q;->g:Ljava/io/Serializable;

    .line 147
    .line 148
    :cond_7
    iget v0, p1, Lwd/u;->b:I

    .line 149
    .line 150
    and-int/2addr v0, v1

    .line 151
    if-ne v0, v1, :cond_8

    .line 152
    .line 153
    iget-object v0, p1, Lwd/u;->g:Lwd/r;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iget v1, p0, Lwd/q;->c:I

    .line 159
    .line 160
    or-int/lit8 v1, v1, 0x10

    .line 161
    .line 162
    iput v1, p0, Lwd/q;->c:I

    .line 163
    .line 164
    iput-object v0, p0, Lwd/q;->h:Ljava/io/Serializable;

    .line 165
    .line 166
    :cond_8
    iget-object v0, p0, Lce/k;->a:Lce/e;

    .line 167
    .line 168
    iget-object p1, p1, Lwd/u;->a:Lce/e;

    .line 169
    .line 170
    invoke-virtual {v0, p1}, Lce/e;->i(Lce/e;)Lce/e;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    iput-object p1, p0, Lce/k;->a:Lce/e;

    .line 175
    .line 176
    return-void
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method

.method public k(Lzd/d;)V
    .locals 5

    .line 1
    sget-object v0, Lzd/d;->j:Lzd/d;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p1, Lzd/d;->b:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    and-int/2addr v0, v1

    .line 10
    if-ne v0, v1, :cond_2

    .line 11
    .line 12
    iget-object v0, p1, Lzd/d;->c:Lzd/b;

    .line 13
    .line 14
    iget v2, p0, Lwd/q;->c:I

    .line 15
    .line 16
    and-int/2addr v2, v1

    .line 17
    if-ne v2, v1, :cond_1

    .line 18
    .line 19
    iget-object v2, p0, Lwd/q;->d:Ljava/io/Serializable;

    .line 20
    .line 21
    check-cast v2, Lzd/b;

    .line 22
    .line 23
    sget-object v3, Lzd/b;->g:Lzd/b;

    .line 24
    .line 25
    if-eq v2, v3, :cond_1

    .line 26
    .line 27
    new-instance v3, Lzd/a;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-direct {v3, v4}, Lzd/a;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v2}, Lzd/a;->h(Lzd/b;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v0}, Lzd/a;->h(Lzd/b;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Lzd/a;->f()Lzd/b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lwd/q;->d:Ljava/io/Serializable;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    iput-object v0, p0, Lwd/q;->d:Ljava/io/Serializable;

    .line 47
    .line 48
    :goto_0
    iget v0, p0, Lwd/q;->c:I

    .line 49
    .line 50
    or-int/2addr v0, v1

    .line 51
    iput v0, p0, Lwd/q;->c:I

    .line 52
    .line 53
    :cond_2
    iget v0, p1, Lzd/d;->b:I

    .line 54
    .line 55
    const/4 v1, 0x2

    .line 56
    and-int/2addr v0, v1

    .line 57
    if-ne v0, v1, :cond_4

    .line 58
    .line 59
    iget-object v0, p1, Lzd/d;->d:Lzd/c;

    .line 60
    .line 61
    iget v2, p0, Lwd/q;->c:I

    .line 62
    .line 63
    and-int/2addr v2, v1

    .line 64
    if-ne v2, v1, :cond_3

    .line 65
    .line 66
    iget-object v2, p0, Lwd/q;->e:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Lzd/c;

    .line 69
    .line 70
    sget-object v3, Lzd/c;->g:Lzd/c;

    .line 71
    .line 72
    if-eq v2, v3, :cond_3

    .line 73
    .line 74
    invoke-static {v2}, Lzd/c;->i(Lzd/c;)Lzd/a;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v2, v0}, Lzd/a;->i(Lzd/c;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Lzd/a;->g()Lzd/c;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, Lwd/q;->e:Ljava/lang/Object;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    iput-object v0, p0, Lwd/q;->e:Ljava/lang/Object;

    .line 89
    .line 90
    :goto_1
    iget v0, p0, Lwd/q;->c:I

    .line 91
    .line 92
    or-int/2addr v0, v1

    .line 93
    iput v0, p0, Lwd/q;->c:I

    .line 94
    .line 95
    :cond_4
    invoke-virtual {p1}, Lzd/d;->i()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_6

    .line 100
    .line 101
    iget-object v0, p1, Lzd/d;->e:Lzd/c;

    .line 102
    .line 103
    iget v1, p0, Lwd/q;->c:I

    .line 104
    .line 105
    const/4 v2, 0x4

    .line 106
    and-int/2addr v1, v2

    .line 107
    if-ne v1, v2, :cond_5

    .line 108
    .line 109
    iget-object v1, p0, Lwd/q;->f:Lce/p;

    .line 110
    .line 111
    check-cast v1, Lzd/c;

    .line 112
    .line 113
    sget-object v3, Lzd/c;->g:Lzd/c;

    .line 114
    .line 115
    if-eq v1, v3, :cond_5

    .line 116
    .line 117
    invoke-static {v1}, Lzd/c;->i(Lzd/c;)Lzd/a;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1, v0}, Lzd/a;->i(Lzd/c;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Lzd/a;->g()Lzd/c;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iput-object v0, p0, Lwd/q;->f:Lce/p;

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    iput-object v0, p0, Lwd/q;->f:Lce/p;

    .line 132
    .line 133
    :goto_2
    iget v0, p0, Lwd/q;->c:I

    .line 134
    .line 135
    or-int/2addr v0, v2

    .line 136
    iput v0, p0, Lwd/q;->c:I

    .line 137
    .line 138
    :cond_6
    iget v0, p1, Lzd/d;->b:I

    .line 139
    .line 140
    const/16 v1, 0x8

    .line 141
    .line 142
    and-int/2addr v0, v1

    .line 143
    if-ne v0, v1, :cond_8

    .line 144
    .line 145
    iget-object v0, p1, Lzd/d;->f:Lzd/c;

    .line 146
    .line 147
    iget v2, p0, Lwd/q;->c:I

    .line 148
    .line 149
    and-int/2addr v2, v1

    .line 150
    if-ne v2, v1, :cond_7

    .line 151
    .line 152
    iget-object v2, p0, Lwd/q;->g:Ljava/io/Serializable;

    .line 153
    .line 154
    check-cast v2, Lzd/c;

    .line 155
    .line 156
    sget-object v3, Lzd/c;->g:Lzd/c;

    .line 157
    .line 158
    if-eq v2, v3, :cond_7

    .line 159
    .line 160
    invoke-static {v2}, Lzd/c;->i(Lzd/c;)Lzd/a;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v2, v0}, Lzd/a;->i(Lzd/c;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Lzd/a;->g()Lzd/c;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    iput-object v0, p0, Lwd/q;->g:Ljava/io/Serializable;

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_7
    iput-object v0, p0, Lwd/q;->g:Ljava/io/Serializable;

    .line 175
    .line 176
    :goto_3
    iget v0, p0, Lwd/q;->c:I

    .line 177
    .line 178
    or-int/2addr v0, v1

    .line 179
    iput v0, p0, Lwd/q;->c:I

    .line 180
    .line 181
    :cond_8
    iget v0, p1, Lzd/d;->b:I

    .line 182
    .line 183
    const/16 v1, 0x10

    .line 184
    .line 185
    and-int/2addr v0, v1

    .line 186
    if-ne v0, v1, :cond_a

    .line 187
    .line 188
    iget-object v0, p1, Lzd/d;->g:Lzd/c;

    .line 189
    .line 190
    iget v2, p0, Lwd/q;->c:I

    .line 191
    .line 192
    and-int/2addr v2, v1

    .line 193
    if-ne v2, v1, :cond_9

    .line 194
    .line 195
    iget-object v2, p0, Lwd/q;->h:Ljava/io/Serializable;

    .line 196
    .line 197
    check-cast v2, Lzd/c;

    .line 198
    .line 199
    sget-object v3, Lzd/c;->g:Lzd/c;

    .line 200
    .line 201
    if-eq v2, v3, :cond_9

    .line 202
    .line 203
    invoke-static {v2}, Lzd/c;->i(Lzd/c;)Lzd/a;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-virtual {v2, v0}, Lzd/a;->i(Lzd/c;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Lzd/a;->g()Lzd/c;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    iput-object v0, p0, Lwd/q;->h:Ljava/io/Serializable;

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_9
    iput-object v0, p0, Lwd/q;->h:Ljava/io/Serializable;

    .line 218
    .line 219
    :goto_4
    iget v0, p0, Lwd/q;->c:I

    .line 220
    .line 221
    or-int/2addr v0, v1

    .line 222
    iput v0, p0, Lwd/q;->c:I

    .line 223
    .line 224
    :cond_a
    iget-object v0, p0, Lce/k;->a:Lce/e;

    .line 225
    .line 226
    iget-object p1, p1, Lzd/d;->a:Lce/e;

    .line 227
    .line 228
    invoke-virtual {v0, p1}, Lce/e;->i(Lce/e;)Lce/e;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    iput-object p1, p0, Lce/k;->a:Lce/e;

    .line 233
    .line 234
    return-void
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
.end method
