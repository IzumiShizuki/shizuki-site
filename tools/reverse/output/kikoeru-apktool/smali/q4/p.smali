.class public abstract Lq4/p;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:[B

.field public static final b:[F

.field public static final c:Ljava/lang/Object;

.field public static d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v0, Lq4/p;->a:[B

    .line 8
    .line 9
    const/16 v0, 0x11

    .line 10
    .line 11
    new-array v0, v0, [F

    .line 12
    .line 13
    fill-array-data v0, :array_1

    .line 14
    .line 15
    .line 16
    sput-object v0, Lq4/p;->b:[F

    .line 17
    .line 18
    new-instance v0, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lq4/p;->c:Ljava/lang/Object;

    .line 24
    .line 25
    const/16 v0, 0xa

    .line 26
    .line 27
    new-array v0, v0, [I

    .line 28
    .line 29
    sput-object v0, Lq4/p;->d:[I

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x400ba2e9
        0x3fe8ba2f
        0x403a2e8c
        0x401b26ca
        0x3fd1745d
        0x3fae8ba3
        0x3ff83e10
        0x3fcede62
        0x3faaaaab
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
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

.method public static a([Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    aput-boolean v0, p0, v0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    aput-boolean v0, p0, v1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    aput-boolean v0, p0, v1

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
.end method

.method public static b([BII[Z)I
    .locals 8

    .line 1
    sub-int v0, p2, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v3, 0x0

    .line 10
    :goto_0
    invoke-static {v3}, Lp4/c;->i(Z)V

    .line 11
    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return p2

    .line 16
    :cond_1
    aget-boolean v3, p3, v1

    .line 17
    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    invoke-static {p3}, Lq4/p;->a([Z)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 p1, p1, -0x3

    .line 24
    .line 25
    return p1

    .line 26
    :cond_2
    const/4 v3, 0x2

    .line 27
    if-le v0, v2, :cond_3

    .line 28
    .line 29
    aget-boolean v4, p3, v2

    .line 30
    .line 31
    if-eqz v4, :cond_3

    .line 32
    .line 33
    aget-byte v4, p0, p1

    .line 34
    .line 35
    if-ne v4, v2, :cond_3

    .line 36
    .line 37
    invoke-static {p3}, Lq4/p;->a([Z)V

    .line 38
    .line 39
    .line 40
    sub-int/2addr p1, v3

    .line 41
    return p1

    .line 42
    :cond_3
    if-le v0, v3, :cond_4

    .line 43
    .line 44
    aget-boolean v4, p3, v3

    .line 45
    .line 46
    if-eqz v4, :cond_4

    .line 47
    .line 48
    aget-byte v4, p0, p1

    .line 49
    .line 50
    if-nez v4, :cond_4

    .line 51
    .line 52
    add-int/lit8 v4, p1, 0x1

    .line 53
    .line 54
    aget-byte v4, p0, v4

    .line 55
    .line 56
    if-ne v4, v2, :cond_4

    .line 57
    .line 58
    invoke-static {p3}, Lq4/p;->a([Z)V

    .line 59
    .line 60
    .line 61
    sub-int/2addr p1, v2

    .line 62
    return p1

    .line 63
    :cond_4
    add-int/lit8 v4, p2, -0x1

    .line 64
    .line 65
    add-int/2addr p1, v3

    .line 66
    :goto_1
    if-ge p1, v4, :cond_7

    .line 67
    .line 68
    aget-byte v5, p0, p1

    .line 69
    .line 70
    and-int/lit16 v6, v5, 0xfe

    .line 71
    .line 72
    if-eqz v6, :cond_5

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_5
    add-int/lit8 v6, p1, -0x2

    .line 76
    .line 77
    aget-byte v7, p0, v6

    .line 78
    .line 79
    if-nez v7, :cond_6

    .line 80
    .line 81
    add-int/lit8 v7, p1, -0x1

    .line 82
    .line 83
    aget-byte v7, p0, v7

    .line 84
    .line 85
    if-nez v7, :cond_6

    .line 86
    .line 87
    if-ne v5, v2, :cond_6

    .line 88
    .line 89
    invoke-static {p3}, Lq4/p;->a([Z)V

    .line 90
    .line 91
    .line 92
    return v6

    .line 93
    :cond_6
    add-int/lit8 p1, p1, -0x2

    .line 94
    .line 95
    :goto_2
    add-int/lit8 p1, p1, 0x3

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_7
    if-le v0, v3, :cond_9

    .line 99
    .line 100
    add-int/lit8 p1, p2, -0x3

    .line 101
    .line 102
    aget-byte p1, p0, p1

    .line 103
    .line 104
    if-nez p1, :cond_8

    .line 105
    .line 106
    add-int/lit8 p1, p2, -0x2

    .line 107
    .line 108
    aget-byte p1, p0, p1

    .line 109
    .line 110
    if-nez p1, :cond_8

    .line 111
    .line 112
    aget-byte p1, p0, v4

    .line 113
    .line 114
    if-ne p1, v2, :cond_8

    .line 115
    .line 116
    :goto_3
    const/4 p1, 0x1

    .line 117
    goto :goto_4

    .line 118
    :cond_8
    const/4 p1, 0x0

    .line 119
    goto :goto_4

    .line 120
    :cond_9
    if-ne v0, v3, :cond_a

    .line 121
    .line 122
    aget-boolean p1, p3, v3

    .line 123
    .line 124
    if-eqz p1, :cond_8

    .line 125
    .line 126
    add-int/lit8 p1, p2, -0x2

    .line 127
    .line 128
    aget-byte p1, p0, p1

    .line 129
    .line 130
    if-nez p1, :cond_8

    .line 131
    .line 132
    aget-byte p1, p0, v4

    .line 133
    .line 134
    if-ne p1, v2, :cond_8

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_a
    aget-boolean p1, p3, v2

    .line 138
    .line 139
    if-eqz p1, :cond_8

    .line 140
    .line 141
    aget-byte p1, p0, v4

    .line 142
    .line 143
    if-ne p1, v2, :cond_8

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :goto_4
    aput-boolean p1, p3, v1

    .line 147
    .line 148
    if-le v0, v2, :cond_c

    .line 149
    .line 150
    add-int/lit8 p1, p2, -0x2

    .line 151
    .line 152
    aget-byte p1, p0, p1

    .line 153
    .line 154
    if-nez p1, :cond_b

    .line 155
    .line 156
    aget-byte p1, p0, v4

    .line 157
    .line 158
    if-nez p1, :cond_b

    .line 159
    .line 160
    :goto_5
    const/4 p1, 0x1

    .line 161
    goto :goto_6

    .line 162
    :cond_b
    const/4 p1, 0x0

    .line 163
    goto :goto_6

    .line 164
    :cond_c
    aget-boolean p1, p3, v3

    .line 165
    .line 166
    if-eqz p1, :cond_b

    .line 167
    .line 168
    aget-byte p1, p0, v4

    .line 169
    .line 170
    if-nez p1, :cond_b

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :goto_6
    aput-boolean p1, p3, v2

    .line 174
    .line 175
    aget-byte p0, p0, v4

    .line 176
    .line 177
    if-nez p0, :cond_d

    .line 178
    .line 179
    const/4 v1, 0x1

    .line 180
    :cond_d
    aput-boolean v1, p3, v3

    .line 181
    .line 182
    return p2
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
.end method

.method public static c([BILm4/q;)Z
    .locals 5

    .line 1
    iget-object v0, p2, Lm4/q;->n:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "video/avc"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x4

    .line 10
    const/16 v2, 0xe

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    aget-byte p0, p0, v1

    .line 16
    .line 17
    and-int/lit8 p1, p0, 0x60

    .line 18
    .line 19
    shr-int/lit8 p1, p1, 0x5

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    and-int/lit8 p0, p0, 0x1f

    .line 25
    .line 26
    if-ne p0, v3, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/16 p1, 0x9

    .line 30
    .line 31
    if-ne p0, p1, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    if-ne p0, v2, :cond_5

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    iget-object v0, p2, Lm4/q;->n:Ljava/lang/String;

    .line 38
    .line 39
    const-string v4, "video/hevc"

    .line 40
    .line 41
    invoke-static {v0, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_5

    .line 46
    .line 47
    new-instance v0, Lp4/r;

    .line 48
    .line 49
    add-int/2addr p1, v1

    .line 50
    invoke-direct {v0, p0, v1, p1}, Lp4/r;-><init>([BII)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lq4/p;->e(Lp4/r;)Li7/j1;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iget p1, p0, Li7/j1;->a:I

    .line 58
    .line 59
    const/16 v0, 0x23

    .line 60
    .line 61
    if-ne p1, v0, :cond_4

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    if-gt p1, v2, :cond_5

    .line 65
    .line 66
    rem-int/lit8 p1, p1, 0x2

    .line 67
    .line 68
    if-nez p1, :cond_5

    .line 69
    .line 70
    iget p0, p0, Li7/j1;->c:I

    .line 71
    .line 72
    iget p1, p2, Lm4/q;->C:I

    .line 73
    .line 74
    sub-int/2addr p1, v3

    .line 75
    if-ne p0, p1, :cond_5

    .line 76
    .line 77
    :goto_0
    const/4 p0, 0x0

    .line 78
    return p0

    .line 79
    :cond_5
    :goto_1
    return v3
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

.method public static d(Lm4/q;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lm4/q;->n:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "video/avc"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    iget-object v0, p0, Lm4/q;->n:Ljava/lang/String;

    .line 14
    .line 15
    const-string v1, "video/hevc"

    .line 16
    .line 17
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    iget-object p0, p0, Lm4/q;->k:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {p0, v1}, Lm4/o0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_2
    :goto_0
    const/4 p0, 0x2

    .line 35
    return p0
    .line 36
.end method

.method public static e(Lp4/r;)Li7/j1;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lp4/r;->s()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x6

    .line 5
    invoke-virtual {p0, v0}, Lp4/r;->i(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0, v0}, Lp4/r;->i(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x3

    .line 14
    invoke-virtual {p0, v2}, Lp4/r;->i(I)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    add-int/lit8 p0, p0, -0x1

    .line 19
    .line 20
    new-instance v2, Li7/j1;

    .line 21
    .line 22
    invoke-direct {v2, v1, v0, p0}, Li7/j1;-><init>(III)V

    .line 23
    .line 24
    .line 25
    return-object v2
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

.method public static f(Lp4/r;ZILq4/h;)Lq4/h;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const/4 v3, 0x6

    .line 8
    new-array v4, v3, [I

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/16 v6, 0x8

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    if-eqz p1, :cond_3

    .line 15
    .line 16
    invoke-virtual {v0, v5}, Lp4/r;->i(I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 21
    .line 22
    .line 23
    move-result v8

    .line 24
    const/4 v9, 0x5

    .line 25
    invoke-virtual {v0, v9}, Lp4/r;->i(I)I

    .line 26
    .line 27
    .line 28
    move-result v9

    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v11, 0x0

    .line 31
    :goto_0
    const/16 v12, 0x20

    .line 32
    .line 33
    if-ge v10, v12, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 36
    .line 37
    .line 38
    move-result v12

    .line 39
    if-eqz v12, :cond_0

    .line 40
    .line 41
    const/4 v12, 0x1

    .line 42
    shl-int/2addr v12, v10

    .line 43
    or-int/2addr v11, v12

    .line 44
    :cond_0
    add-int/lit8 v10, v10, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v10, 0x0

    .line 48
    :goto_1
    if-ge v10, v3, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0, v6}, Lp4/r;->i(I)I

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    aput v12, v4, v10

    .line 55
    .line 56
    add-int/lit8 v10, v10, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move v13, v2

    .line 60
    :goto_2
    move-object/from16 v17, v4

    .line 61
    .line 62
    move v14, v8

    .line 63
    move v15, v9

    .line 64
    move/from16 v16, v11

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    if-eqz v2, :cond_4

    .line 68
    .line 69
    iget v3, v2, Lq4/h;->a:I

    .line 70
    .line 71
    iget-boolean v8, v2, Lq4/h;->b:Z

    .line 72
    .line 73
    iget v9, v2, Lq4/h;->c:I

    .line 74
    .line 75
    iget v11, v2, Lq4/h;->d:I

    .line 76
    .line 77
    iget-object v4, v2, Lq4/h;->e:[I

    .line 78
    .line 79
    move v13, v3

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    move-object/from16 v17, v4

    .line 82
    .line 83
    const/4 v13, 0x0

    .line 84
    const/4 v14, 0x0

    .line 85
    const/4 v15, 0x0

    .line 86
    const/16 v16, 0x0

    .line 87
    .line 88
    :goto_3
    invoke-virtual {v0, v6}, Lp4/r;->i(I)I

    .line 89
    .line 90
    .line 91
    move-result v18

    .line 92
    const/4 v2, 0x0

    .line 93
    :goto_4
    if-ge v7, v1, :cond_7

    .line 94
    .line 95
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_5

    .line 100
    .line 101
    add-int/lit8 v2, v2, 0x58

    .line 102
    .line 103
    :cond_5
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_6

    .line 108
    .line 109
    add-int/lit8 v2, v2, 0x8

    .line 110
    .line 111
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_7
    invoke-virtual {v0, v2}, Lp4/r;->t(I)V

    .line 115
    .line 116
    .line 117
    if-lez v1, :cond_8

    .line 118
    .line 119
    sub-int/2addr v6, v1

    .line 120
    mul-int/lit8 v6, v6, 0x2

    .line 121
    .line 122
    invoke-virtual {v0, v6}, Lp4/r;->t(I)V

    .line 123
    .line 124
    .line 125
    :cond_8
    new-instance v12, Lq4/h;

    .line 126
    .line 127
    invoke-direct/range {v12 .. v18}, Lq4/h;-><init>(IZII[II)V

    .line 128
    .line 129
    .line 130
    return-object v12
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
.end method

.method public static g([BII)Lq4/k;
    .locals 8

    .line 1
    add-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    add-int/lit8 p2, p2, -0x1

    .line 4
    .line 5
    :goto_0
    aget-byte v0, p0, p2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    if-le p2, p1, :cond_0

    .line 10
    .line 11
    add-int/lit8 p2, p2, -0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    if-eqz v0, :cond_e

    .line 15
    .line 16
    if-gt p2, p1, :cond_1

    .line 17
    .line 18
    goto/16 :goto_7

    .line 19
    .line 20
    :cond_1
    new-instance v0, Lp4/r;

    .line 21
    .line 22
    add-int/lit8 p2, p2, 0x1

    .line 23
    .line 24
    invoke-direct {v0, p0, p1, p2}, Lp4/r;-><init>([BII)V

    .line 25
    .line 26
    .line 27
    :cond_2
    const/16 p0, 0x10

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Lp4/r;->d(I)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_e

    .line 34
    .line 35
    const/16 p0, 0x8

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Lp4/r;->i(I)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    const/4 p2, 0x0

    .line 42
    const/4 v1, 0x0

    .line 43
    :goto_1
    const/16 v2, 0xff

    .line 44
    .line 45
    if-ne p1, v2, :cond_3

    .line 46
    .line 47
    add-int/lit16 v1, v1, 0xff

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Lp4/r;->i(I)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    add-int/2addr v1, p1

    .line 55
    invoke-virtual {v0, p0}, Lp4/r;->i(I)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    const/4 v3, 0x0

    .line 60
    :goto_2
    if-ne p1, v2, :cond_4

    .line 61
    .line 62
    add-int/lit16 v3, v3, 0xff

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Lp4/r;->i(I)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    goto :goto_2

    .line 69
    :cond_4
    add-int/2addr v3, p1

    .line 70
    if-eqz v3, :cond_e

    .line 71
    .line 72
    invoke-virtual {v0, v3}, Lp4/r;->d(I)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_5

    .line 77
    .line 78
    goto/16 :goto_7

    .line 79
    .line 80
    :cond_5
    const/16 p0, 0xb0

    .line 81
    .line 82
    if-ne v1, p0, :cond_2

    .line 83
    .line 84
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-eqz p1, :cond_6

    .line 93
    .line 94
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    goto :goto_3

    .line 99
    :cond_6
    const/4 v1, 0x0

    .line 100
    :goto_3
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    const/4 v3, -0x1

    .line 105
    const/4 v4, 0x0

    .line 106
    :goto_4
    if-gt v4, v2, :cond_d

    .line 107
    .line 108
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 113
    .line 114
    .line 115
    const/4 v5, 0x6

    .line 116
    invoke-virtual {v0, v5}, Lp4/r;->i(I)I

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    const/16 v7, 0x3f

    .line 121
    .line 122
    if-ne v6, v7, :cond_7

    .line 123
    .line 124
    goto :goto_7

    .line 125
    :cond_7
    if-nez v6, :cond_8

    .line 126
    .line 127
    add-int/lit8 v6, p0, -0x1e

    .line 128
    .line 129
    invoke-static {p2, v6}, Ljava/lang/Math;->max(II)I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    goto :goto_5

    .line 134
    :cond_8
    add-int/2addr v6, p0

    .line 135
    add-int/lit8 v6, v6, -0x1f

    .line 136
    .line 137
    invoke-static {p2, v6}, Ljava/lang/Math;->max(II)I

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    :goto_5
    invoke-virtual {v0, v6}, Lp4/r;->i(I)I

    .line 142
    .line 143
    .line 144
    if-eqz p1, :cond_b

    .line 145
    .line 146
    invoke-virtual {v0, v5}, Lp4/r;->i(I)I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-ne v5, v7, :cond_9

    .line 151
    .line 152
    goto :goto_7

    .line 153
    :cond_9
    if-nez v5, :cond_a

    .line 154
    .line 155
    add-int/lit8 v5, v1, -0x1e

    .line 156
    .line 157
    invoke-static {p2, v5}, Ljava/lang/Math;->max(II)I

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    goto :goto_6

    .line 162
    :cond_a
    add-int/2addr v5, v1

    .line 163
    add-int/lit8 v5, v5, -0x1f

    .line 164
    .line 165
    invoke-static {p2, v5}, Ljava/lang/Math;->max(II)I

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    :goto_6
    invoke-virtual {v0, v5}, Lp4/r;->i(I)I

    .line 170
    .line 171
    .line 172
    :cond_b
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    if-eqz v5, :cond_c

    .line 177
    .line 178
    const/16 v5, 0xa

    .line 179
    .line 180
    invoke-virtual {v0, v5}, Lp4/r;->t(I)V

    .line 181
    .line 182
    .line 183
    :cond_c
    add-int/lit8 v4, v4, 0x1

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_d
    new-instance p0, Lq4/k;

    .line 187
    .line 188
    invoke-direct {p0, v3}, Lq4/k;-><init>(I)V

    .line 189
    .line 190
    .line 191
    return-object p0

    .line 192
    :cond_e
    :goto_7
    const/4 p0, 0x0

    .line 193
    return-object p0
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
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
.end method

.method public static h([BIILb0/w1;)Lq4/l;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    new-instance v4, Lp4/r;

    .line 10
    .line 11
    invoke-direct {v4, v0, v1, v2}, Lp4/r;-><init>([BII)V

    .line 12
    .line 13
    .line 14
    invoke-static {v4}, Lq4/p;->e(Lp4/r;)Li7/j1;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const/4 v5, 0x2

    .line 19
    add-int/2addr v1, v5

    .line 20
    new-instance v6, Lp4/r;

    .line 21
    .line 22
    invoke-direct {v6, v0, v1, v2}, Lp4/r;-><init>([BII)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    invoke-virtual {v6, v0}, Lp4/r;->t(I)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x3

    .line 30
    invoke-virtual {v6, v1}, Lp4/r;->i(I)I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    iget v2, v4, Li7/j1;->b:I

    .line 35
    .line 36
    const/4 v4, 0x1

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    const/4 v9, 0x7

    .line 40
    if-ne v8, v9, :cond_0

    .line 41
    .line 42
    const/4 v9, 0x1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v9, 0x0

    .line 45
    :goto_0
    if-eqz v3, :cond_1

    .line 46
    .line 47
    iget-object v10, v3, Lb0/w1;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v10, Lya/i0;

    .line 50
    .line 51
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v11

    .line 55
    if-nez v11, :cond_1

    .line 56
    .line 57
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->size()I

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    sub-int/2addr v11, v4

    .line 62
    invoke-static {v2, v11}, Ljava/lang/Math;->min(II)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Lq4/g;

    .line 71
    .line 72
    iget v2, v2, Lq4/g;->a:I

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    const/4 v2, 0x0

    .line 76
    :goto_1
    const/4 v10, 0x0

    .line 77
    if-nez v9, :cond_2

    .line 78
    .line 79
    invoke-virtual {v6}, Lp4/r;->s()V

    .line 80
    .line 81
    .line 82
    invoke-static {v6, v4, v8, v10}, Lq4/p;->f(Lp4/r;ZILq4/h;)Lq4/h;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    goto :goto_2

    .line 87
    :cond_2
    if-eqz v3, :cond_3

    .line 88
    .line 89
    iget-object v11, v3, Lb0/w1;->d:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v11, Lq4/i;

    .line 92
    .line 93
    iget-object v12, v11, Lq4/i;->b:[I

    .line 94
    .line 95
    iget-object v11, v11, Lq4/i;->a:Lya/i0;

    .line 96
    .line 97
    aget v12, v12, v2

    .line 98
    .line 99
    invoke-virtual {v11}, Ljava/util/AbstractCollection;->size()I

    .line 100
    .line 101
    .line 102
    move-result v13

    .line 103
    if-le v13, v12, :cond_3

    .line 104
    .line 105
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    check-cast v10, Lq4/h;

    .line 110
    .line 111
    :cond_3
    :goto_2
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 112
    .line 113
    .line 114
    const/16 v11, 0x8

    .line 115
    .line 116
    const/4 v12, -0x1

    .line 117
    if-eqz v9, :cond_7

    .line 118
    .line 119
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 120
    .line 121
    .line 122
    move-result v13

    .line 123
    if-eqz v13, :cond_4

    .line 124
    .line 125
    invoke-virtual {v6, v11}, Lp4/r;->i(I)I

    .line 126
    .line 127
    .line 128
    move-result v13

    .line 129
    goto :goto_3

    .line 130
    :cond_4
    const/4 v13, -0x1

    .line 131
    :goto_3
    if-eqz v3, :cond_6

    .line 132
    .line 133
    iget-object v14, v3, Lb0/w1;->e:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v14, Lq4/i;

    .line 136
    .line 137
    if-eqz v14, :cond_6

    .line 138
    .line 139
    iget-object v15, v14, Lq4/i;->a:Lya/i0;

    .line 140
    .line 141
    if-ne v13, v12, :cond_5

    .line 142
    .line 143
    iget-object v13, v14, Lq4/i;->b:[I

    .line 144
    .line 145
    aget v13, v13, v2

    .line 146
    .line 147
    :cond_5
    if-eq v13, v12, :cond_6

    .line 148
    .line 149
    invoke-virtual {v15}, Ljava/util/AbstractCollection;->size()I

    .line 150
    .line 151
    .line 152
    move-result v14

    .line 153
    if-le v14, v13, :cond_6

    .line 154
    .line 155
    invoke-interface {v15, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v13

    .line 159
    check-cast v13, Lq4/j;

    .line 160
    .line 161
    iget v14, v13, Lq4/j;->a:I

    .line 162
    .line 163
    iget v14, v13, Lq4/j;->d:I

    .line 164
    .line 165
    iget v15, v13, Lq4/j;->e:I

    .line 166
    .line 167
    iget v12, v13, Lq4/j;->b:I

    .line 168
    .line 169
    iget v13, v13, Lq4/j;->c:I

    .line 170
    .line 171
    goto :goto_7

    .line 172
    :cond_6
    const/4 v12, 0x0

    .line 173
    const/4 v13, 0x0

    .line 174
    const/4 v14, 0x0

    .line 175
    const/4 v15, 0x0

    .line 176
    goto :goto_7

    .line 177
    :cond_7
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 178
    .line 179
    .line 180
    move-result v12

    .line 181
    if-ne v12, v1, :cond_8

    .line 182
    .line 183
    invoke-virtual {v6}, Lp4/r;->s()V

    .line 184
    .line 185
    .line 186
    :cond_8
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 187
    .line 188
    .line 189
    move-result v13

    .line 190
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 191
    .line 192
    .line 193
    move-result v14

    .line 194
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 195
    .line 196
    .line 197
    move-result v15

    .line 198
    if-eqz v15, :cond_c

    .line 199
    .line 200
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 201
    .line 202
    .line 203
    move-result v15

    .line 204
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 205
    .line 206
    .line 207
    move-result v16

    .line 208
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 209
    .line 210
    .line 211
    move-result v17

    .line 212
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 213
    .line 214
    .line 215
    move-result v18

    .line 216
    if-eq v12, v4, :cond_a

    .line 217
    .line 218
    if-ne v12, v5, :cond_9

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_9
    const/16 v19, 0x1

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_a
    :goto_4
    const/16 v19, 0x2

    .line 225
    .line 226
    :goto_5
    add-int v15, v15, v16

    .line 227
    .line 228
    mul-int v15, v15, v19

    .line 229
    .line 230
    sub-int/2addr v13, v15

    .line 231
    if-ne v12, v4, :cond_b

    .line 232
    .line 233
    const/4 v12, 0x2

    .line 234
    goto :goto_6

    .line 235
    :cond_b
    const/4 v12, 0x1

    .line 236
    :goto_6
    add-int v17, v17, v18

    .line 237
    .line 238
    mul-int v17, v17, v12

    .line 239
    .line 240
    sub-int v14, v14, v17

    .line 241
    .line 242
    :cond_c
    move v15, v14

    .line 243
    move v14, v13

    .line 244
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 245
    .line 246
    .line 247
    move-result v12

    .line 248
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 249
    .line 250
    .line 251
    move-result v13

    .line 252
    :goto_7
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 253
    .line 254
    .line 255
    move-result v16

    .line 256
    if-nez v9, :cond_e

    .line 257
    .line 258
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 259
    .line 260
    .line 261
    move-result v17

    .line 262
    if-eqz v17, :cond_d

    .line 263
    .line 264
    const/16 v17, 0x0

    .line 265
    .line 266
    goto :goto_8

    .line 267
    :cond_d
    move/from16 v17, v8

    .line 268
    .line 269
    :goto_8
    move/from16 v7, v17

    .line 270
    .line 271
    const/4 v11, -0x1

    .line 272
    :goto_9
    if-gt v7, v8, :cond_f

    .line 273
    .line 274
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 275
    .line 276
    .line 277
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 278
    .line 279
    .line 280
    move-result v5

    .line 281
    invoke-static {v5, v11}, Ljava/lang/Math;->max(II)I

    .line 282
    .line 283
    .line 284
    move-result v11

    .line 285
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 286
    .line 287
    .line 288
    add-int/lit8 v7, v7, 0x1

    .line 289
    .line 290
    const/4 v5, 0x2

    .line 291
    goto :goto_9

    .line 292
    :cond_e
    const/4 v11, -0x1

    .line 293
    :cond_f
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 294
    .line 295
    .line 296
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 297
    .line 298
    .line 299
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 300
    .line 301
    .line 302
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 303
    .line 304
    .line 305
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 306
    .line 307
    .line 308
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 309
    .line 310
    .line 311
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 312
    .line 313
    .line 314
    move-result v5

    .line 315
    if-eqz v5, :cond_11

    .line 316
    .line 317
    if-eqz v9, :cond_10

    .line 318
    .line 319
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 320
    .line 321
    .line 322
    move-result v5

    .line 323
    goto :goto_a

    .line 324
    :cond_10
    const/4 v5, 0x0

    .line 325
    :goto_a
    const/4 v7, 0x6

    .line 326
    if-eqz v5, :cond_12

    .line 327
    .line 328
    invoke-virtual {v6, v7}, Lp4/r;->t(I)V

    .line 329
    .line 330
    .line 331
    :cond_11
    const/4 v0, 0x2

    .line 332
    goto :goto_10

    .line 333
    :cond_12
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    if-eqz v5, :cond_11

    .line 338
    .line 339
    const/4 v5, 0x0

    .line 340
    :goto_b
    if-ge v5, v0, :cond_11

    .line 341
    .line 342
    const/4 v9, 0x0

    .line 343
    :goto_c
    if-ge v9, v7, :cond_17

    .line 344
    .line 345
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 346
    .line 347
    .line 348
    move-result v18

    .line 349
    if-nez v18, :cond_13

    .line 350
    .line 351
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 352
    .line 353
    .line 354
    goto :goto_e

    .line 355
    :cond_13
    shl-int/lit8 v18, v5, 0x1

    .line 356
    .line 357
    add-int/lit8 v18, v18, 0x4

    .line 358
    .line 359
    shl-int v0, v4, v18

    .line 360
    .line 361
    const/16 v7, 0x40

    .line 362
    .line 363
    invoke-static {v7, v0}, Ljava/lang/Math;->min(II)I

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    if-le v5, v4, :cond_14

    .line 368
    .line 369
    invoke-virtual {v6}, Lp4/r;->n()I

    .line 370
    .line 371
    .line 372
    :cond_14
    const/4 v7, 0x0

    .line 373
    :goto_d
    if-ge v7, v0, :cond_15

    .line 374
    .line 375
    invoke-virtual {v6}, Lp4/r;->n()I

    .line 376
    .line 377
    .line 378
    add-int/lit8 v7, v7, 0x1

    .line 379
    .line 380
    goto :goto_d

    .line 381
    :cond_15
    :goto_e
    if-ne v5, v1, :cond_16

    .line 382
    .line 383
    const/4 v0, 0x3

    .line 384
    goto :goto_f

    .line 385
    :cond_16
    const/4 v0, 0x1

    .line 386
    :goto_f
    add-int/2addr v9, v0

    .line 387
    const/4 v0, 0x4

    .line 388
    const/4 v7, 0x6

    .line 389
    goto :goto_c

    .line 390
    :cond_17
    add-int/lit8 v5, v5, 0x1

    .line 391
    .line 392
    const/4 v0, 0x4

    .line 393
    const/4 v7, 0x6

    .line 394
    goto :goto_b

    .line 395
    :goto_10
    invoke-virtual {v6, v0}, Lp4/r;->t(I)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-eqz v0, :cond_18

    .line 403
    .line 404
    const/16 v0, 0x8

    .line 405
    .line 406
    invoke-virtual {v6, v0}, Lp4/r;->t(I)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 410
    .line 411
    .line 412
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 413
    .line 414
    .line 415
    invoke-virtual {v6}, Lp4/r;->s()V

    .line 416
    .line 417
    .line 418
    :cond_18
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    const/4 v5, 0x0

    .line 423
    new-array v7, v5, [I

    .line 424
    .line 425
    new-array v9, v5, [I

    .line 426
    .line 427
    const/16 p1, 0x1

    .line 428
    .line 429
    const/4 v1, -0x1

    .line 430
    const/4 v4, 0x0

    .line 431
    const/4 v5, -0x1

    .line 432
    :goto_11
    if-ge v4, v0, :cond_2a

    .line 433
    .line 434
    if-eqz v4, :cond_25

    .line 435
    .line 436
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 437
    .line 438
    .line 439
    move-result v20

    .line 440
    if-eqz v20, :cond_25

    .line 441
    .line 442
    move/from16 v20, v0

    .line 443
    .line 444
    add-int v0, v5, v1

    .line 445
    .line 446
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 447
    .line 448
    .line 449
    move-result v21

    .line 450
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 451
    .line 452
    .line 453
    move-result v22

    .line 454
    add-int/lit8 v22, v22, 0x1

    .line 455
    .line 456
    const/16 v17, 0x2

    .line 457
    .line 458
    mul-int/lit8 v21, v21, 0x2

    .line 459
    .line 460
    rsub-int/lit8 v21, v21, 0x1

    .line 461
    .line 462
    mul-int v21, v21, v22

    .line 463
    .line 464
    move/from16 v22, v2

    .line 465
    .line 466
    add-int/lit8 v2, v0, 0x1

    .line 467
    .line 468
    move/from16 v23, v4

    .line 469
    .line 470
    new-array v4, v2, [Z

    .line 471
    .line 472
    move-object/from16 v24, v4

    .line 473
    .line 474
    const/4 v4, 0x0

    .line 475
    :goto_12
    if-gt v4, v0, :cond_1a

    .line 476
    .line 477
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 478
    .line 479
    .line 480
    move-result v25

    .line 481
    if-nez v25, :cond_19

    .line 482
    .line 483
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 484
    .line 485
    .line 486
    move-result v25

    .line 487
    aput-boolean v25, v24, v4

    .line 488
    .line 489
    goto :goto_13

    .line 490
    :cond_19
    aput-boolean p1, v24, v4

    .line 491
    .line 492
    :goto_13
    add-int/lit8 v4, v4, 0x1

    .line 493
    .line 494
    goto :goto_12

    .line 495
    :cond_1a
    new-array v4, v2, [I

    .line 496
    .line 497
    new-array v2, v2, [I

    .line 498
    .line 499
    add-int/lit8 v25, v1, -0x1

    .line 500
    .line 501
    const/16 v26, 0x0

    .line 502
    .line 503
    :goto_14
    if-ltz v25, :cond_1c

    .line 504
    .line 505
    aget v27, v9, v25

    .line 506
    .line 507
    add-int v27, v27, v21

    .line 508
    .line 509
    if-gez v27, :cond_1b

    .line 510
    .line 511
    add-int v28, v5, v25

    .line 512
    .line 513
    aget-boolean v28, v24, v28

    .line 514
    .line 515
    if-eqz v28, :cond_1b

    .line 516
    .line 517
    add-int/lit8 v28, v26, 0x1

    .line 518
    .line 519
    aput v27, v4, v26

    .line 520
    .line 521
    move/from16 v26, v28

    .line 522
    .line 523
    :cond_1b
    add-int/lit8 v25, v25, -0x1

    .line 524
    .line 525
    goto :goto_14

    .line 526
    :cond_1c
    if-gez v21, :cond_1d

    .line 527
    .line 528
    aget-boolean v25, v24, v0

    .line 529
    .line 530
    if-eqz v25, :cond_1d

    .line 531
    .line 532
    add-int/lit8 v25, v26, 0x1

    .line 533
    .line 534
    aput v21, v4, v26

    .line 535
    .line 536
    move/from16 v26, v25

    .line 537
    .line 538
    :cond_1d
    move/from16 v25, v0

    .line 539
    .line 540
    move/from16 v0, v26

    .line 541
    .line 542
    move-object/from16 v26, v7

    .line 543
    .line 544
    const/4 v7, 0x0

    .line 545
    :goto_15
    if-ge v7, v5, :cond_1f

    .line 546
    .line 547
    aget v27, v26, v7

    .line 548
    .line 549
    add-int v27, v27, v21

    .line 550
    .line 551
    if-gez v27, :cond_1e

    .line 552
    .line 553
    aget-boolean v28, v24, v7

    .line 554
    .line 555
    if-eqz v28, :cond_1e

    .line 556
    .line 557
    add-int/lit8 v28, v0, 0x1

    .line 558
    .line 559
    aput v27, v4, v0

    .line 560
    .line 561
    move/from16 v0, v28

    .line 562
    .line 563
    :cond_1e
    add-int/lit8 v7, v7, 0x1

    .line 564
    .line 565
    goto :goto_15

    .line 566
    :cond_1f
    invoke-static {v4, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 567
    .line 568
    .line 569
    move-result-object v4

    .line 570
    add-int/lit8 v7, v5, -0x1

    .line 571
    .line 572
    const/16 v27, 0x0

    .line 573
    .line 574
    :goto_16
    if-ltz v7, :cond_21

    .line 575
    .line 576
    aget v28, v26, v7

    .line 577
    .line 578
    add-int v28, v28, v21

    .line 579
    .line 580
    if-lez v28, :cond_20

    .line 581
    .line 582
    aget-boolean v29, v24, v7

    .line 583
    .line 584
    if-eqz v29, :cond_20

    .line 585
    .line 586
    add-int/lit8 v29, v27, 0x1

    .line 587
    .line 588
    aput v28, v2, v27

    .line 589
    .line 590
    move/from16 v27, v29

    .line 591
    .line 592
    :cond_20
    add-int/lit8 v7, v7, -0x1

    .line 593
    .line 594
    goto :goto_16

    .line 595
    :cond_21
    if-lez v21, :cond_22

    .line 596
    .line 597
    aget-boolean v7, v24, v25

    .line 598
    .line 599
    if-eqz v7, :cond_22

    .line 600
    .line 601
    add-int/lit8 v7, v27, 0x1

    .line 602
    .line 603
    aput v21, v2, v27

    .line 604
    .line 605
    move/from16 v27, v7

    .line 606
    .line 607
    :cond_22
    move/from16 v25, v0

    .line 608
    .line 609
    move/from16 v7, v27

    .line 610
    .line 611
    const/4 v0, 0x0

    .line 612
    :goto_17
    if-ge v0, v1, :cond_24

    .line 613
    .line 614
    aget v26, v9, v0

    .line 615
    .line 616
    add-int v26, v26, v21

    .line 617
    .line 618
    if-lez v26, :cond_23

    .line 619
    .line 620
    add-int v27, v5, v0

    .line 621
    .line 622
    aget-boolean v27, v24, v27

    .line 623
    .line 624
    if-eqz v27, :cond_23

    .line 625
    .line 626
    add-int/lit8 v27, v7, 0x1

    .line 627
    .line 628
    aput v26, v2, v7

    .line 629
    .line 630
    move/from16 v7, v27

    .line 631
    .line 632
    :cond_23
    add-int/lit8 v0, v0, 0x1

    .line 633
    .line 634
    goto :goto_17

    .line 635
    :cond_24
    invoke-static {v2, v7}, Ljava/util/Arrays;->copyOf([II)[I

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    move-object v9, v0

    .line 640
    move v1, v7

    .line 641
    move/from16 v5, v25

    .line 642
    .line 643
    move-object v7, v4

    .line 644
    goto :goto_1c

    .line 645
    :cond_25
    move/from16 v20, v0

    .line 646
    .line 647
    move/from16 v22, v2

    .line 648
    .line 649
    move/from16 v23, v4

    .line 650
    .line 651
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 656
    .line 657
    .line 658
    move-result v1

    .line 659
    new-array v2, v0, [I

    .line 660
    .line 661
    const/4 v4, 0x0

    .line 662
    :goto_18
    if-ge v4, v0, :cond_27

    .line 663
    .line 664
    if-lez v4, :cond_26

    .line 665
    .line 666
    add-int/lit8 v5, v4, -0x1

    .line 667
    .line 668
    aget v5, v2, v5

    .line 669
    .line 670
    goto :goto_19

    .line 671
    :cond_26
    const/4 v5, 0x0

    .line 672
    :goto_19
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 673
    .line 674
    .line 675
    move-result v7

    .line 676
    add-int/lit8 v7, v7, 0x1

    .line 677
    .line 678
    sub-int/2addr v5, v7

    .line 679
    aput v5, v2, v4

    .line 680
    .line 681
    invoke-virtual {v6}, Lp4/r;->s()V

    .line 682
    .line 683
    .line 684
    add-int/lit8 v4, v4, 0x1

    .line 685
    .line 686
    goto :goto_18

    .line 687
    :cond_27
    new-array v4, v1, [I

    .line 688
    .line 689
    const/4 v5, 0x0

    .line 690
    :goto_1a
    if-ge v5, v1, :cond_29

    .line 691
    .line 692
    if-lez v5, :cond_28

    .line 693
    .line 694
    add-int/lit8 v7, v5, -0x1

    .line 695
    .line 696
    aget v7, v4, v7

    .line 697
    .line 698
    goto :goto_1b

    .line 699
    :cond_28
    const/4 v7, 0x0

    .line 700
    :goto_1b
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 701
    .line 702
    .line 703
    move-result v9

    .line 704
    add-int/lit8 v9, v9, 0x1

    .line 705
    .line 706
    add-int/2addr v9, v7

    .line 707
    aput v9, v4, v5

    .line 708
    .line 709
    invoke-virtual {v6}, Lp4/r;->s()V

    .line 710
    .line 711
    .line 712
    add-int/lit8 v5, v5, 0x1

    .line 713
    .line 714
    goto :goto_1a

    .line 715
    :cond_29
    move v5, v0

    .line 716
    move-object v7, v2

    .line 717
    move-object v9, v4

    .line 718
    :goto_1c
    add-int/lit8 v4, v23, 0x1

    .line 719
    .line 720
    move/from16 v0, v20

    .line 721
    .line 722
    move/from16 v2, v22

    .line 723
    .line 724
    goto/16 :goto_11

    .line 725
    .line 726
    :cond_2a
    move/from16 v22, v2

    .line 727
    .line 728
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 729
    .line 730
    .line 731
    move-result v0

    .line 732
    if-eqz v0, :cond_2b

    .line 733
    .line 734
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 735
    .line 736
    .line 737
    move-result v0

    .line 738
    const/4 v7, 0x0

    .line 739
    :goto_1d
    if-ge v7, v0, :cond_2b

    .line 740
    .line 741
    add-int/lit8 v1, v16, 0x5

    .line 742
    .line 743
    invoke-virtual {v6, v1}, Lp4/r;->t(I)V

    .line 744
    .line 745
    .line 746
    add-int/lit8 v7, v7, 0x1

    .line 747
    .line 748
    goto :goto_1d

    .line 749
    :cond_2b
    const/4 v0, 0x2

    .line 750
    invoke-virtual {v6, v0}, Lp4/r;->t(I)V

    .line 751
    .line 752
    .line 753
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 754
    .line 755
    .line 756
    move-result v1

    .line 757
    const/high16 v2, 0x3f800000    # 1.0f

    .line 758
    .line 759
    if-eqz v1, :cond_36

    .line 760
    .line 761
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 762
    .line 763
    .line 764
    move-result v1

    .line 765
    if-eqz v1, :cond_2e

    .line 766
    .line 767
    const/16 v1, 0x8

    .line 768
    .line 769
    invoke-virtual {v6, v1}, Lp4/r;->i(I)I

    .line 770
    .line 771
    .line 772
    move-result v4

    .line 773
    const/16 v1, 0xff

    .line 774
    .line 775
    if-ne v4, v1, :cond_2c

    .line 776
    .line 777
    const/16 v1, 0x10

    .line 778
    .line 779
    invoke-virtual {v6, v1}, Lp4/r;->i(I)I

    .line 780
    .line 781
    .line 782
    move-result v4

    .line 783
    invoke-virtual {v6, v1}, Lp4/r;->i(I)I

    .line 784
    .line 785
    .line 786
    move-result v1

    .line 787
    if-eqz v4, :cond_2e

    .line 788
    .line 789
    if-eqz v1, :cond_2e

    .line 790
    .line 791
    int-to-float v2, v4

    .line 792
    int-to-float v1, v1

    .line 793
    div-float/2addr v2, v1

    .line 794
    goto :goto_1e

    .line 795
    :cond_2c
    const/16 v1, 0x11

    .line 796
    .line 797
    if-ge v4, v1, :cond_2d

    .line 798
    .line 799
    sget-object v1, Lq4/p;->b:[F

    .line 800
    .line 801
    aget v2, v1, v4

    .line 802
    .line 803
    goto :goto_1e

    .line 804
    :cond_2d
    const-string v1, "NalUnitUtil"

    .line 805
    .line 806
    const-string v5, "Unexpected aspect_ratio_idc value: "

    .line 807
    .line 808
    invoke-static {v4, v5, v1}, Lq/t0;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 809
    .line 810
    .line 811
    :cond_2e
    :goto_1e
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 812
    .line 813
    .line 814
    move-result v1

    .line 815
    if-eqz v1, :cond_2f

    .line 816
    .line 817
    invoke-virtual {v6}, Lp4/r;->s()V

    .line 818
    .line 819
    .line 820
    :cond_2f
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 821
    .line 822
    .line 823
    move-result v1

    .line 824
    if-eqz v1, :cond_32

    .line 825
    .line 826
    const/4 v1, 0x3

    .line 827
    invoke-virtual {v6, v1}, Lp4/r;->t(I)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 831
    .line 832
    .line 833
    move-result v1

    .line 834
    if-eqz v1, :cond_30

    .line 835
    .line 836
    const/4 v5, 0x1

    .line 837
    goto :goto_1f

    .line 838
    :cond_30
    const/4 v5, 0x2

    .line 839
    :goto_1f
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 840
    .line 841
    .line 842
    move-result v0

    .line 843
    if-eqz v0, :cond_31

    .line 844
    .line 845
    const/16 v0, 0x8

    .line 846
    .line 847
    invoke-virtual {v6, v0}, Lp4/r;->i(I)I

    .line 848
    .line 849
    .line 850
    move-result v1

    .line 851
    invoke-virtual {v6, v0}, Lp4/r;->i(I)I

    .line 852
    .line 853
    .line 854
    move-result v3

    .line 855
    invoke-virtual {v6, v0}, Lp4/r;->t(I)V

    .line 856
    .line 857
    .line 858
    invoke-static {v1}, Lm4/h;->f(I)I

    .line 859
    .line 860
    .line 861
    move-result v0

    .line 862
    invoke-static {v3}, Lm4/h;->g(I)I

    .line 863
    .line 864
    .line 865
    move-result v1

    .line 866
    goto :goto_20

    .line 867
    :cond_31
    const/4 v0, -0x1

    .line 868
    const/4 v1, -0x1

    .line 869
    goto :goto_20

    .line 870
    :cond_32
    if-eqz v3, :cond_33

    .line 871
    .line 872
    iget-object v0, v3, Lb0/w1;->b:Ljava/lang/Object;

    .line 873
    .line 874
    check-cast v0, Lq4/i;

    .line 875
    .line 876
    if-eqz v0, :cond_33

    .line 877
    .line 878
    iget-object v1, v0, Lq4/i;->a:Lya/i0;

    .line 879
    .line 880
    iget-object v0, v0, Lq4/i;->b:[I

    .line 881
    .line 882
    aget v0, v0, v22

    .line 883
    .line 884
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 885
    .line 886
    .line 887
    move-result v3

    .line 888
    if-le v3, v0, :cond_33

    .line 889
    .line 890
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    check-cast v0, Lq4/m;

    .line 895
    .line 896
    iget v1, v0, Lq4/m;->a:I

    .line 897
    .line 898
    iget v3, v0, Lq4/m;->b:I

    .line 899
    .line 900
    iget v0, v0, Lq4/m;->c:I

    .line 901
    .line 902
    move v5, v1

    .line 903
    move v1, v0

    .line 904
    move v0, v5

    .line 905
    move v5, v3

    .line 906
    goto :goto_20

    .line 907
    :cond_33
    const/4 v0, -0x1

    .line 908
    const/4 v1, -0x1

    .line 909
    const/4 v5, -0x1

    .line 910
    :goto_20
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 911
    .line 912
    .line 913
    move-result v3

    .line 914
    if-eqz v3, :cond_34

    .line 915
    .line 916
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 917
    .line 918
    .line 919
    invoke-virtual {v6}, Lp4/r;->m()I

    .line 920
    .line 921
    .line 922
    :cond_34
    invoke-virtual {v6}, Lp4/r;->s()V

    .line 923
    .line 924
    .line 925
    invoke-virtual {v6}, Lp4/r;->h()Z

    .line 926
    .line 927
    .line 928
    move-result v3

    .line 929
    if-eqz v3, :cond_35

    .line 930
    .line 931
    mul-int/lit8 v15, v15, 0x2

    .line 932
    .line 933
    :cond_35
    move/from16 v16, v0

    .line 934
    .line 935
    move/from16 v18, v1

    .line 936
    .line 937
    move/from16 v17, v5

    .line 938
    .line 939
    goto :goto_21

    .line 940
    :cond_36
    const/16 v16, -0x1

    .line 941
    .line 942
    const/16 v17, -0x1

    .line 943
    .line 944
    const/16 v18, -0x1

    .line 945
    .line 946
    :goto_21
    new-instance v7, Lq4/l;

    .line 947
    .line 948
    move v9, v15

    .line 949
    move v15, v11

    .line 950
    move v11, v13

    .line 951
    move v13, v9

    .line 952
    move-object v9, v10

    .line 953
    move v10, v12

    .line 954
    move v12, v14

    .line 955
    move v14, v2

    .line 956
    invoke-direct/range {v7 .. v18}, Lq4/l;-><init>(ILq4/h;IIIIFIIII)V

    .line 957
    .line 958
    .line 959
    return-object v7
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
.end method

.method public static i([BII)Lb0/w1;
    .locals 40

    .line 1
    new-instance v0, Lp4/r;

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move/from16 v2, p1

    .line 6
    .line 7
    move/from16 v3, p2

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lp4/r;-><init>([BII)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lq4/p;->e(Lp4/r;)Li7/j1;

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    invoke-virtual {v0, v1}, Lp4/r;->t(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x6

    .line 28
    invoke-virtual {v0, v4}, Lp4/r;->i(I)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    add-int/lit8 v6, v5, 0x1

    .line 33
    .line 34
    const/4 v7, 0x3

    .line 35
    invoke-virtual {v0, v7}, Lp4/r;->i(I)I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    const/16 v9, 0x11

    .line 40
    .line 41
    invoke-virtual {v0, v9}, Lp4/r;->t(I)V

    .line 42
    .line 43
    .line 44
    const/4 v9, 0x1

    .line 45
    const/4 v10, 0x0

    .line 46
    invoke-static {v0, v9, v8, v10}, Lq4/p;->f(Lp4/r;ZILq4/h;)Lq4/h;

    .line 47
    .line 48
    .line 49
    move-result-object v11

    .line 50
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 51
    .line 52
    .line 53
    move-result v12

    .line 54
    const/4 v13, 0x0

    .line 55
    if-eqz v12, :cond_0

    .line 56
    .line 57
    const/4 v12, 0x0

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v12, v8

    .line 60
    :goto_0
    if-gt v12, v8, :cond_1

    .line 61
    .line 62
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 69
    .line 70
    .line 71
    add-int/lit8 v12, v12, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {v0, v4}, Lp4/r;->i(I)I

    .line 75
    .line 76
    .line 77
    move-result v12

    .line 78
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 79
    .line 80
    .line 81
    move-result v14

    .line 82
    add-int/2addr v14, v9

    .line 83
    invoke-static {v11}, Lya/i0;->u(Ljava/lang/Object;)Lya/a1;

    .line 84
    .line 85
    .line 86
    move-result-object v15

    .line 87
    const/16 p0, 0x6

    .line 88
    .line 89
    new-instance v4, Lq4/i;

    .line 90
    .line 91
    new-array v7, v9, [I

    .line 92
    .line 93
    const/16 p2, 0x1

    .line 94
    .line 95
    const/4 v9, 0x0

    .line 96
    invoke-direct {v4, v15, v7, v9}, Lq4/i;-><init>(Lya/a1;[II)V

    .line 97
    .line 98
    .line 99
    const/4 v7, 0x2

    .line 100
    if-lt v6, v7, :cond_2

    .line 101
    .line 102
    if-lt v14, v7, :cond_2

    .line 103
    .line 104
    const/4 v9, 0x1

    .line 105
    goto :goto_1

    .line 106
    :cond_2
    const/4 v9, 0x0

    .line 107
    :goto_1
    if-eqz v2, :cond_3

    .line 108
    .line 109
    if-eqz v3, :cond_3

    .line 110
    .line 111
    const/4 v2, 0x1

    .line 112
    goto :goto_2

    .line 113
    :cond_3
    const/4 v2, 0x0

    .line 114
    :goto_2
    add-int/lit8 v3, v12, 0x1

    .line 115
    .line 116
    if-lt v3, v6, :cond_4

    .line 117
    .line 118
    const/4 v15, 0x1

    .line 119
    goto :goto_3

    .line 120
    :cond_4
    const/4 v15, 0x0

    .line 121
    :goto_3
    if-eqz v9, :cond_5

    .line 122
    .line 123
    if-eqz v2, :cond_5

    .line 124
    .line 125
    if-nez v15, :cond_6

    .line 126
    .line 127
    :cond_5
    move-object v1, v10

    .line 128
    goto/16 :goto_5e

    .line 129
    .line 130
    :cond_6
    new-array v2, v7, [I

    .line 131
    .line 132
    aput v3, v2, p2

    .line 133
    .line 134
    aput v14, v2, v13

    .line 135
    .line 136
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 137
    .line 138
    invoke-static {v9, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    check-cast v2, [[I

    .line 143
    .line 144
    new-array v15, v14, [I

    .line 145
    .line 146
    new-array v7, v14, [I

    .line 147
    .line 148
    aget-object v17, v2, v13

    .line 149
    .line 150
    aput v13, v17, v13

    .line 151
    .line 152
    aput p2, v15, v13

    .line 153
    .line 154
    aput v13, v7, v13

    .line 155
    .line 156
    const/4 v13, 0x1

    .line 157
    :goto_4
    if-ge v13, v14, :cond_9

    .line 158
    .line 159
    const/4 v10, 0x0

    .line 160
    const/16 v19, 0x0

    .line 161
    .line 162
    :goto_5
    if-gt v10, v12, :cond_8

    .line 163
    .line 164
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 165
    .line 166
    .line 167
    move-result v20

    .line 168
    if-eqz v20, :cond_7

    .line 169
    .line 170
    aget-object v20, v2, v13

    .line 171
    .line 172
    add-int/lit8 v21, v19, 0x1

    .line 173
    .line 174
    aput v10, v20, v19

    .line 175
    .line 176
    aput v10, v7, v13

    .line 177
    .line 178
    move/from16 v19, v21

    .line 179
    .line 180
    :cond_7
    aput v19, v15, v13

    .line 181
    .line 182
    add-int/lit8 v10, v10, 0x1

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_8
    add-int/lit8 v13, v13, 0x1

    .line 186
    .line 187
    const/4 v10, 0x0

    .line 188
    goto :goto_4

    .line 189
    :cond_9
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    if-eqz v10, :cond_18

    .line 194
    .line 195
    const/16 v10, 0x40

    .line 196
    .line 197
    invoke-virtual {v0, v10}, Lp4/r;->t(I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 201
    .line 202
    .line 203
    move-result v10

    .line 204
    if-eqz v10, :cond_a

    .line 205
    .line 206
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 207
    .line 208
    .line 209
    :cond_a
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    const/4 v1, 0x0

    .line 214
    :goto_6
    if-ge v1, v10, :cond_18

    .line 215
    .line 216
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 217
    .line 218
    .line 219
    if-eqz v1, :cond_d

    .line 220
    .line 221
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 222
    .line 223
    .line 224
    move-result v20

    .line 225
    if-eqz v20, :cond_b

    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_b
    const/16 v20, 0x0

    .line 229
    .line 230
    const/16 v21, 0x0

    .line 231
    .line 232
    :cond_c
    const/16 v22, 0x0

    .line 233
    .line 234
    goto :goto_8

    .line 235
    :cond_d
    :goto_7
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 236
    .line 237
    .line 238
    move-result v20

    .line 239
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 240
    .line 241
    .line 242
    move-result v21

    .line 243
    if-nez v20, :cond_e

    .line 244
    .line 245
    if-eqz v21, :cond_c

    .line 246
    .line 247
    :cond_e
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 248
    .line 249
    .line 250
    move-result v22

    .line 251
    if-eqz v22, :cond_f

    .line 252
    .line 253
    const/16 v13, 0x13

    .line 254
    .line 255
    invoke-virtual {v0, v13}, Lp4/r;->t(I)V

    .line 256
    .line 257
    .line 258
    :cond_f
    const/16 v13, 0x8

    .line 259
    .line 260
    invoke-virtual {v0, v13}, Lp4/r;->t(I)V

    .line 261
    .line 262
    .line 263
    if-eqz v22, :cond_10

    .line 264
    .line 265
    const/4 v13, 0x4

    .line 266
    invoke-virtual {v0, v13}, Lp4/r;->t(I)V

    .line 267
    .line 268
    .line 269
    :cond_10
    const/16 v13, 0xf

    .line 270
    .line 271
    invoke-virtual {v0, v13}, Lp4/r;->t(I)V

    .line 272
    .line 273
    .line 274
    :goto_8
    const/4 v13, 0x0

    .line 275
    :goto_9
    if-gt v13, v8, :cond_17

    .line 276
    .line 277
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 278
    .line 279
    .line 280
    move-result v24

    .line 281
    if-nez v24, :cond_11

    .line 282
    .line 283
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 284
    .line 285
    .line 286
    move-result v24

    .line 287
    :cond_11
    if-eqz v24, :cond_12

    .line 288
    .line 289
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 290
    .line 291
    .line 292
    const/16 v24, 0x0

    .line 293
    .line 294
    goto :goto_a

    .line 295
    :cond_12
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 296
    .line 297
    .line 298
    move-result v24

    .line 299
    :goto_a
    if-nez v24, :cond_13

    .line 300
    .line 301
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 302
    .line 303
    .line 304
    move-result v24

    .line 305
    move/from16 v25, v24

    .line 306
    .line 307
    move/from16 v24, v1

    .line 308
    .line 309
    move/from16 v1, v25

    .line 310
    .line 311
    :goto_b
    move-object/from16 v25, v2

    .line 312
    .line 313
    goto :goto_c

    .line 314
    :cond_13
    move/from16 v24, v1

    .line 315
    .line 316
    const/4 v1, 0x0

    .line 317
    goto :goto_b

    .line 318
    :goto_c
    add-int v2, v20, v21

    .line 319
    .line 320
    move-object/from16 v26, v7

    .line 321
    .line 322
    const/4 v7, 0x0

    .line 323
    :goto_d
    if-ge v7, v2, :cond_16

    .line 324
    .line 325
    move/from16 v27, v2

    .line 326
    .line 327
    const/4 v2, 0x0

    .line 328
    :goto_e
    if-gt v2, v1, :cond_15

    .line 329
    .line 330
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 334
    .line 335
    .line 336
    if-eqz v22, :cond_14

    .line 337
    .line 338
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 342
    .line 343
    .line 344
    :cond_14
    invoke-virtual {v0}, Lp4/r;->s()V

    .line 345
    .line 346
    .line 347
    add-int/lit8 v2, v2, 0x1

    .line 348
    .line 349
    goto :goto_e

    .line 350
    :cond_15
    add-int/lit8 v7, v7, 0x1

    .line 351
    .line 352
    move/from16 v2, v27

    .line 353
    .line 354
    goto :goto_d

    .line 355
    :cond_16
    add-int/lit8 v13, v13, 0x1

    .line 356
    .line 357
    move/from16 v1, v24

    .line 358
    .line 359
    move-object/from16 v2, v25

    .line 360
    .line 361
    move-object/from16 v7, v26

    .line 362
    .line 363
    goto :goto_9

    .line 364
    :cond_17
    move/from16 v24, v1

    .line 365
    .line 366
    move-object/from16 v25, v2

    .line 367
    .line 368
    move-object/from16 v26, v7

    .line 369
    .line 370
    add-int/lit8 v1, v24, 0x1

    .line 371
    .line 372
    goto/16 :goto_6

    .line 373
    .line 374
    :cond_18
    move-object/from16 v25, v2

    .line 375
    .line 376
    move-object/from16 v26, v7

    .line 377
    .line 378
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    if-nez v1, :cond_19

    .line 383
    .line 384
    new-instance v0, Lb0/w1;

    .line 385
    .line 386
    const/4 v1, 0x0

    .line 387
    invoke-direct {v0, v1, v4, v1, v1}, Lb0/w1;-><init>(Lya/a1;Lq4/i;Lq4/i;Lq4/i;)V

    .line 388
    .line 389
    .line 390
    return-object v0

    .line 391
    :cond_19
    iget v1, v0, Lp4/r;->e:I

    .line 392
    .line 393
    if-lez v1, :cond_1a

    .line 394
    .line 395
    const/16 v23, 0x8

    .line 396
    .line 397
    rsub-int/lit8 v13, v1, 0x8

    .line 398
    .line 399
    invoke-virtual {v0, v13}, Lp4/r;->t(I)V

    .line 400
    .line 401
    .line 402
    :cond_1a
    const/4 v1, 0x0

    .line 403
    invoke-static {v0, v1, v8, v11}, Lq4/p;->f(Lp4/r;ZILq4/h;)Lq4/h;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    const/16 v7, 0x10

    .line 412
    .line 413
    new-array v10, v7, [Z

    .line 414
    .line 415
    move/from16 v20, v1

    .line 416
    .line 417
    const/4 v1, 0x0

    .line 418
    const/4 v13, 0x0

    .line 419
    :goto_f
    if-ge v13, v7, :cond_1c

    .line 420
    .line 421
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 422
    .line 423
    .line 424
    move-result v21

    .line 425
    aput-boolean v21, v10, v13

    .line 426
    .line 427
    if-eqz v21, :cond_1b

    .line 428
    .line 429
    add-int/lit8 v1, v1, 0x1

    .line 430
    .line 431
    :cond_1b
    add-int/lit8 v13, v13, 0x1

    .line 432
    .line 433
    goto :goto_f

    .line 434
    :cond_1c
    if-eqz v1, :cond_1d

    .line 435
    .line 436
    aget-boolean v13, v10, p2

    .line 437
    .line 438
    if-nez v13, :cond_1e

    .line 439
    .line 440
    :cond_1d
    const/4 v1, 0x0

    .line 441
    goto/16 :goto_5d

    .line 442
    .line 443
    :cond_1e
    new-array v13, v1, [I

    .line 444
    .line 445
    move-object/from16 v22, v10

    .line 446
    .line 447
    const/4 v7, 0x0

    .line 448
    :goto_10
    sub-int v10, v1, v20

    .line 449
    .line 450
    if-ge v7, v10, :cond_1f

    .line 451
    .line 452
    const/4 v10, 0x3

    .line 453
    invoke-virtual {v0, v10}, Lp4/r;->i(I)I

    .line 454
    .line 455
    .line 456
    move-result v24

    .line 457
    aput v24, v13, v7

    .line 458
    .line 459
    add-int/lit8 v7, v7, 0x1

    .line 460
    .line 461
    goto :goto_10

    .line 462
    :cond_1f
    add-int/lit8 v7, v1, 0x1

    .line 463
    .line 464
    new-array v7, v7, [I

    .line 465
    .line 466
    if-eqz v20, :cond_22

    .line 467
    .line 468
    const/4 v10, 0x1

    .line 469
    :goto_11
    if-ge v10, v1, :cond_21

    .line 470
    .line 471
    move-object/from16 v24, v7

    .line 472
    .line 473
    const/4 v7, 0x0

    .line 474
    :goto_12
    if-ge v7, v10, :cond_20

    .line 475
    .line 476
    aget v27, v24, v10

    .line 477
    .line 478
    aget v28, v13, v7

    .line 479
    .line 480
    add-int/lit8 v28, v28, 0x1

    .line 481
    .line 482
    add-int v28, v28, v27

    .line 483
    .line 484
    aput v28, v24, v10

    .line 485
    .line 486
    add-int/lit8 v7, v7, 0x1

    .line 487
    .line 488
    goto :goto_12

    .line 489
    :cond_20
    add-int/lit8 v10, v10, 0x1

    .line 490
    .line 491
    move-object/from16 v7, v24

    .line 492
    .line 493
    goto :goto_11

    .line 494
    :cond_21
    move-object/from16 v24, v7

    .line 495
    .line 496
    aput p0, v24, v1

    .line 497
    .line 498
    :goto_13
    const/4 v7, 0x2

    .line 499
    goto :goto_14

    .line 500
    :cond_22
    move-object/from16 v24, v7

    .line 501
    .line 502
    goto :goto_13

    .line 503
    :goto_14
    new-array v10, v7, [I

    .line 504
    .line 505
    aput v1, v10, p2

    .line 506
    .line 507
    const/16 v17, 0x0

    .line 508
    .line 509
    aput v6, v10, v17

    .line 510
    .line 511
    invoke-static {v9, v10}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v7

    .line 515
    check-cast v7, [[I

    .line 516
    .line 517
    new-array v9, v6, [I

    .line 518
    .line 519
    aput v17, v9, v17

    .line 520
    .line 521
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 522
    .line 523
    .line 524
    move-result v10

    .line 525
    move-object/from16 v27, v7

    .line 526
    .line 527
    const/4 v7, 0x1

    .line 528
    :goto_15
    if-ge v7, v6, :cond_26

    .line 529
    .line 530
    if-eqz v10, :cond_23

    .line 531
    .line 532
    move/from16 v28, v7

    .line 533
    .line 534
    const/4 v7, 0x6

    .line 535
    invoke-virtual {v0, v7}, Lp4/r;->i(I)I

    .line 536
    .line 537
    .line 538
    move-result v29

    .line 539
    aput v29, v9, v28

    .line 540
    .line 541
    goto :goto_16

    .line 542
    :cond_23
    move/from16 v28, v7

    .line 543
    .line 544
    const/4 v7, 0x6

    .line 545
    aput v28, v9, v28

    .line 546
    .line 547
    :goto_16
    if-nez v20, :cond_24

    .line 548
    .line 549
    const/4 v7, 0x0

    .line 550
    :goto_17
    if-ge v7, v1, :cond_25

    .line 551
    .line 552
    aget-object v29, v27, v28

    .line 553
    .line 554
    aget v30, v13, v7

    .line 555
    .line 556
    move/from16 v31, v7

    .line 557
    .line 558
    add-int/lit8 v7, v30, 0x1

    .line 559
    .line 560
    invoke-virtual {v0, v7}, Lp4/r;->i(I)I

    .line 561
    .line 562
    .line 563
    move-result v7

    .line 564
    aput v7, v29, v31

    .line 565
    .line 566
    add-int/lit8 v7, v31, 0x1

    .line 567
    .line 568
    goto :goto_17

    .line 569
    :cond_24
    const/4 v7, 0x0

    .line 570
    :goto_18
    if-ge v7, v1, :cond_25

    .line 571
    .line 572
    aget-object v29, v27, v28

    .line 573
    .line 574
    aget v30, v9, v28

    .line 575
    .line 576
    add-int/lit8 v31, v7, 0x1

    .line 577
    .line 578
    aget v32, v24, v31

    .line 579
    .line 580
    shl-int v32, p2, v32

    .line 581
    .line 582
    add-int/lit8 v32, v32, -0x1

    .line 583
    .line 584
    and-int v30, v30, v32

    .line 585
    .line 586
    aget v32, v24, v7

    .line 587
    .line 588
    shr-int v30, v30, v32

    .line 589
    .line 590
    aput v30, v29, v7

    .line 591
    .line 592
    move/from16 v7, v31

    .line 593
    .line 594
    goto :goto_18

    .line 595
    :cond_25
    add-int/lit8 v7, v28, 0x1

    .line 596
    .line 597
    const/16 p0, 0x6

    .line 598
    .line 599
    goto :goto_15

    .line 600
    :cond_26
    new-array v1, v3, [I

    .line 601
    .line 602
    const/4 v7, 0x1

    .line 603
    const/4 v10, 0x0

    .line 604
    :goto_19
    const/4 v13, -0x1

    .line 605
    if-ge v10, v6, :cond_2d

    .line 606
    .line 607
    aget v20, v9, v10

    .line 608
    .line 609
    aput v13, v1, v20

    .line 610
    .line 611
    move-object/from16 v24, v1

    .line 612
    .line 613
    const/4 v13, 0x0

    .line 614
    const/16 v20, 0x0

    .line 615
    .line 616
    :goto_1a
    const/16 v1, 0x10

    .line 617
    .line 618
    if-ge v13, v1, :cond_29

    .line 619
    .line 620
    aget-boolean v1, v22, v13

    .line 621
    .line 622
    if-eqz v1, :cond_28

    .line 623
    .line 624
    const/4 v1, 0x1

    .line 625
    if-ne v13, v1, :cond_27

    .line 626
    .line 627
    aget v1, v9, v10

    .line 628
    .line 629
    aget-object v28, v27, v10

    .line 630
    .line 631
    aget v28, v28, v20

    .line 632
    .line 633
    aput v28, v24, v1

    .line 634
    .line 635
    :cond_27
    add-int/lit8 v20, v20, 0x1

    .line 636
    .line 637
    :cond_28
    add-int/lit8 v13, v13, 0x1

    .line 638
    .line 639
    const/16 p2, 0x1

    .line 640
    .line 641
    goto :goto_1a

    .line 642
    :cond_29
    if-lez v10, :cond_2c

    .line 643
    .line 644
    const/4 v1, 0x0

    .line 645
    :goto_1b
    if-ge v1, v10, :cond_2b

    .line 646
    .line 647
    aget v13, v9, v10

    .line 648
    .line 649
    aget v13, v24, v13

    .line 650
    .line 651
    aget v20, v9, v1

    .line 652
    .line 653
    move/from16 v28, v1

    .line 654
    .line 655
    aget v1, v24, v20

    .line 656
    .line 657
    if-ne v13, v1, :cond_2a

    .line 658
    .line 659
    const/4 v1, 0x0

    .line 660
    goto :goto_1c

    .line 661
    :cond_2a
    add-int/lit8 v1, v28, 0x1

    .line 662
    .line 663
    goto :goto_1b

    .line 664
    :cond_2b
    const/4 v1, 0x1

    .line 665
    :goto_1c
    if-eqz v1, :cond_2c

    .line 666
    .line 667
    add-int/lit8 v7, v7, 0x1

    .line 668
    .line 669
    :cond_2c
    add-int/lit8 v10, v10, 0x1

    .line 670
    .line 671
    move-object/from16 v1, v24

    .line 672
    .line 673
    const/16 p2, 0x1

    .line 674
    .line 675
    goto :goto_19

    .line 676
    :cond_2d
    move-object/from16 v24, v1

    .line 677
    .line 678
    const/4 v1, 0x4

    .line 679
    invoke-virtual {v0, v1}, Lp4/r;->i(I)I

    .line 680
    .line 681
    .line 682
    move-result v10

    .line 683
    const/4 v1, 0x2

    .line 684
    if-lt v7, v1, :cond_88

    .line 685
    .line 686
    if-nez v10, :cond_2e

    .line 687
    .line 688
    goto/16 :goto_5c

    .line 689
    .line 690
    :cond_2e
    new-array v1, v7, [I

    .line 691
    .line 692
    const/4 v13, 0x0

    .line 693
    :goto_1d
    if-ge v13, v7, :cond_2f

    .line 694
    .line 695
    invoke-virtual {v0, v10}, Lp4/r;->i(I)I

    .line 696
    .line 697
    .line 698
    move-result v20

    .line 699
    aput v20, v1, v13

    .line 700
    .line 701
    add-int/lit8 v13, v13, 0x1

    .line 702
    .line 703
    goto :goto_1d

    .line 704
    :cond_2f
    new-array v10, v3, [I

    .line 705
    .line 706
    const/4 v13, 0x0

    .line 707
    :goto_1e
    if-ge v13, v6, :cond_30

    .line 708
    .line 709
    move-object/from16 v20, v1

    .line 710
    .line 711
    aget v1, v9, v13

    .line 712
    .line 713
    invoke-static {v1, v12}, Ljava/lang/Math;->min(II)I

    .line 714
    .line 715
    .line 716
    move-result v1

    .line 717
    aput v13, v10, v1

    .line 718
    .line 719
    add-int/lit8 v13, v13, 0x1

    .line 720
    .line 721
    move-object/from16 v1, v20

    .line 722
    .line 723
    goto :goto_1e

    .line 724
    :cond_30
    move-object/from16 v20, v1

    .line 725
    .line 726
    invoke-static {}, Lya/i0;->p()Lya/f0;

    .line 727
    .line 728
    .line 729
    move-result-object v1

    .line 730
    const/4 v13, 0x0

    .line 731
    :goto_1f
    if-gt v13, v12, :cond_32

    .line 732
    .line 733
    move/from16 v22, v7

    .line 734
    .line 735
    aget v7, v24, v13

    .line 736
    .line 737
    move-object/from16 v28, v9

    .line 738
    .line 739
    const/16 v27, 0x1

    .line 740
    .line 741
    add-int/lit8 v9, v22, -0x1

    .line 742
    .line 743
    invoke-static {v7, v9}, Ljava/lang/Math;->min(II)I

    .line 744
    .line 745
    .line 746
    move-result v7

    .line 747
    if-ltz v7, :cond_31

    .line 748
    .line 749
    aget v7, v20, v7

    .line 750
    .line 751
    goto :goto_20

    .line 752
    :cond_31
    const/4 v7, -0x1

    .line 753
    :goto_20
    new-instance v9, Lq4/g;

    .line 754
    .line 755
    move-object/from16 v27, v10

    .line 756
    .line 757
    aget v10, v27, v13

    .line 758
    .line 759
    invoke-direct {v9, v10, v7}, Lq4/g;-><init>(II)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v1, v9}, Lya/c0;->a(Ljava/lang/Object;)V

    .line 763
    .line 764
    .line 765
    add-int/lit8 v13, v13, 0x1

    .line 766
    .line 767
    move/from16 v7, v22

    .line 768
    .line 769
    move-object/from16 v10, v27

    .line 770
    .line 771
    move-object/from16 v9, v28

    .line 772
    .line 773
    goto :goto_1f

    .line 774
    :cond_32
    move-object/from16 v28, v9

    .line 775
    .line 776
    invoke-virtual {v1}, Lya/f0;->f()Lya/a1;

    .line 777
    .line 778
    .line 779
    move-result-object v1

    .line 780
    const/4 v7, 0x0

    .line 781
    invoke-virtual {v1, v7}, Lya/a1;->get(I)Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v9

    .line 785
    check-cast v9, Lq4/g;

    .line 786
    .line 787
    iget v7, v9, Lq4/g;->b:I

    .line 788
    .line 789
    const/4 v9, -0x1

    .line 790
    if-ne v7, v9, :cond_33

    .line 791
    .line 792
    new-instance v0, Lb0/w1;

    .line 793
    .line 794
    const/4 v1, 0x0

    .line 795
    invoke-direct {v0, v1, v4, v1, v1}, Lb0/w1;-><init>(Lya/a1;Lq4/i;Lq4/i;Lq4/i;)V

    .line 796
    .line 797
    .line 798
    return-object v0

    .line 799
    :cond_33
    const/4 v7, 0x1

    .line 800
    :goto_21
    if-gt v7, v12, :cond_35

    .line 801
    .line 802
    invoke-virtual {v1, v7}, Lya/a1;->get(I)Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v10

    .line 806
    check-cast v10, Lq4/g;

    .line 807
    .line 808
    iget v10, v10, Lq4/g;->b:I

    .line 809
    .line 810
    if-eq v10, v9, :cond_34

    .line 811
    .line 812
    goto :goto_22

    .line 813
    :cond_34
    add-int/lit8 v7, v7, 0x1

    .line 814
    .line 815
    goto :goto_21

    .line 816
    :cond_35
    const/4 v7, -0x1

    .line 817
    :goto_22
    if-ne v7, v9, :cond_36

    .line 818
    .line 819
    new-instance v0, Lb0/w1;

    .line 820
    .line 821
    const/4 v1, 0x0

    .line 822
    invoke-direct {v0, v1, v4, v1, v1}, Lb0/w1;-><init>(Lya/a1;Lq4/i;Lq4/i;Lq4/i;)V

    .line 823
    .line 824
    .line 825
    return-object v0

    .line 826
    :cond_36
    const/4 v9, 0x2

    .line 827
    new-array v10, v9, [I

    .line 828
    .line 829
    const/16 v27, 0x1

    .line 830
    .line 831
    aput v6, v10, v27

    .line 832
    .line 833
    const/16 v17, 0x0

    .line 834
    .line 835
    aput v6, v10, v17

    .line 836
    .line 837
    sget-object v12, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 838
    .line 839
    invoke-static {v12, v10}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v10

    .line 843
    check-cast v10, [[Z

    .line 844
    .line 845
    new-array v13, v9, [I

    .line 846
    .line 847
    aput v6, v13, v27

    .line 848
    .line 849
    aput v6, v13, v17

    .line 850
    .line 851
    invoke-static {v12, v13}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v9

    .line 855
    check-cast v9, [[Z

    .line 856
    .line 857
    const/4 v13, 0x1

    .line 858
    :goto_23
    if-ge v13, v6, :cond_38

    .line 859
    .line 860
    move-object/from16 p0, v9

    .line 861
    .line 862
    const/4 v9, 0x0

    .line 863
    :goto_24
    if-ge v9, v13, :cond_37

    .line 864
    .line 865
    aget-object v20, v10, v13

    .line 866
    .line 867
    aget-object v22, p0, v13

    .line 868
    .line 869
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 870
    .line 871
    .line 872
    move-result v24

    .line 873
    aput-boolean v24, v22, v9

    .line 874
    .line 875
    aput-boolean v24, v20, v9

    .line 876
    .line 877
    add-int/lit8 v9, v9, 0x1

    .line 878
    .line 879
    goto :goto_24

    .line 880
    :cond_37
    add-int/lit8 v13, v13, 0x1

    .line 881
    .line 882
    move-object/from16 v9, p0

    .line 883
    .line 884
    goto :goto_23

    .line 885
    :cond_38
    move-object/from16 p0, v9

    .line 886
    .line 887
    const/4 v9, 0x1

    .line 888
    :goto_25
    if-ge v9, v6, :cond_3c

    .line 889
    .line 890
    const/4 v13, 0x0

    .line 891
    :goto_26
    if-ge v13, v5, :cond_3b

    .line 892
    .line 893
    move-object/from16 v20, v10

    .line 894
    .line 895
    const/4 v10, 0x0

    .line 896
    :goto_27
    if-ge v10, v9, :cond_3a

    .line 897
    .line 898
    aget-object v22, p0, v9

    .line 899
    .line 900
    aget-boolean v24, v22, v10

    .line 901
    .line 902
    if-eqz v24, :cond_39

    .line 903
    .line 904
    aget-object v24, p0, v10

    .line 905
    .line 906
    aget-boolean v24, v24, v13

    .line 907
    .line 908
    if-eqz v24, :cond_39

    .line 909
    .line 910
    const/16 v27, 0x1

    .line 911
    .line 912
    aput-boolean v27, v22, v13

    .line 913
    .line 914
    goto :goto_28

    .line 915
    :cond_39
    add-int/lit8 v10, v10, 0x1

    .line 916
    .line 917
    goto :goto_27

    .line 918
    :cond_3a
    :goto_28
    add-int/lit8 v13, v13, 0x1

    .line 919
    .line 920
    move-object/from16 v10, v20

    .line 921
    .line 922
    goto :goto_26

    .line 923
    :cond_3b
    move-object/from16 v20, v10

    .line 924
    .line 925
    add-int/lit8 v9, v9, 0x1

    .line 926
    .line 927
    goto :goto_25

    .line 928
    :cond_3c
    move-object/from16 v20, v10

    .line 929
    .line 930
    new-array v9, v3, [I

    .line 931
    .line 932
    const/4 v10, 0x0

    .line 933
    :goto_29
    if-ge v10, v6, :cond_3e

    .line 934
    .line 935
    const/4 v13, 0x0

    .line 936
    const/16 v22, 0x0

    .line 937
    .line 938
    :goto_2a
    if-ge v13, v10, :cond_3d

    .line 939
    .line 940
    aget-object v24, v20, v10

    .line 941
    .line 942
    aget-boolean v24, v24, v13

    .line 943
    .line 944
    add-int v22, v22, v24

    .line 945
    .line 946
    add-int/lit8 v13, v13, 0x1

    .line 947
    .line 948
    goto :goto_2a

    .line 949
    :cond_3d
    aget v13, v28, v10

    .line 950
    .line 951
    aput v22, v9, v13

    .line 952
    .line 953
    add-int/lit8 v10, v10, 0x1

    .line 954
    .line 955
    goto :goto_29

    .line 956
    :cond_3e
    const/4 v10, 0x0

    .line 957
    const/4 v13, 0x0

    .line 958
    :goto_2b
    if-ge v10, v6, :cond_40

    .line 959
    .line 960
    aget v22, v28, v10

    .line 961
    .line 962
    aget v22, v9, v22

    .line 963
    .line 964
    if-nez v22, :cond_3f

    .line 965
    .line 966
    add-int/lit8 v13, v13, 0x1

    .line 967
    .line 968
    :cond_3f
    add-int/lit8 v10, v10, 0x1

    .line 969
    .line 970
    goto :goto_2b

    .line 971
    :cond_40
    const/4 v10, 0x1

    .line 972
    if-le v13, v10, :cond_41

    .line 973
    .line 974
    new-instance v0, Lb0/w1;

    .line 975
    .line 976
    const/4 v1, 0x0

    .line 977
    invoke-direct {v0, v1, v4, v1, v1}, Lb0/w1;-><init>(Lya/a1;Lq4/i;Lq4/i;Lq4/i;)V

    .line 978
    .line 979
    .line 980
    return-object v0

    .line 981
    :cond_41
    new-array v10, v6, [I

    .line 982
    .line 983
    new-array v13, v14, [I

    .line 984
    .line 985
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 986
    .line 987
    .line 988
    move-result v22

    .line 989
    if-eqz v22, :cond_42

    .line 990
    .line 991
    move-object/from16 v22, v9

    .line 992
    .line 993
    const/4 v9, 0x0

    .line 994
    :goto_2c
    if-ge v9, v6, :cond_43

    .line 995
    .line 996
    move/from16 v24, v9

    .line 997
    .line 998
    const/4 v9, 0x3

    .line 999
    invoke-virtual {v0, v9}, Lp4/r;->i(I)I

    .line 1000
    .line 1001
    .line 1002
    move-result v27

    .line 1003
    aput v27, v10, v24

    .line 1004
    .line 1005
    add-int/lit8 v9, v24, 0x1

    .line 1006
    .line 1007
    goto :goto_2c

    .line 1008
    :cond_42
    move-object/from16 v22, v9

    .line 1009
    .line 1010
    const/4 v9, 0x0

    .line 1011
    invoke-static {v10, v9, v6, v8}, Ljava/util/Arrays;->fill([IIII)V

    .line 1012
    .line 1013
    .line 1014
    :cond_43
    const/4 v9, 0x0

    .line 1015
    :goto_2d
    if-ge v9, v14, :cond_45

    .line 1016
    .line 1017
    move/from16 v24, v9

    .line 1018
    .line 1019
    move-object/from16 v27, v10

    .line 1020
    .line 1021
    move-object/from16 v29, v13

    .line 1022
    .line 1023
    const/4 v9, 0x0

    .line 1024
    const/4 v10, 0x0

    .line 1025
    :goto_2e
    aget v13, v15, v24

    .line 1026
    .line 1027
    if-ge v9, v13, :cond_44

    .line 1028
    .line 1029
    aget-object v13, v25, v24

    .line 1030
    .line 1031
    aget v13, v13, v9

    .line 1032
    .line 1033
    invoke-virtual {v1, v13}, Lya/a1;->get(I)Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v13

    .line 1037
    check-cast v13, Lq4/g;

    .line 1038
    .line 1039
    iget v13, v13, Lq4/g;->a:I

    .line 1040
    .line 1041
    aget v13, v27, v13

    .line 1042
    .line 1043
    invoke-static {v10, v13}, Ljava/lang/Math;->max(II)I

    .line 1044
    .line 1045
    .line 1046
    move-result v10

    .line 1047
    add-int/lit8 v9, v9, 0x1

    .line 1048
    .line 1049
    goto :goto_2e

    .line 1050
    :cond_44
    add-int/lit8 v10, v10, 0x1

    .line 1051
    .line 1052
    aput v10, v29, v24

    .line 1053
    .line 1054
    add-int/lit8 v9, v24, 0x1

    .line 1055
    .line 1056
    move-object/from16 v10, v27

    .line 1057
    .line 1058
    move-object/from16 v13, v29

    .line 1059
    .line 1060
    goto :goto_2d

    .line 1061
    :cond_45
    move-object/from16 v29, v13

    .line 1062
    .line 1063
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 1064
    .line 1065
    .line 1066
    move-result v9

    .line 1067
    if-eqz v9, :cond_48

    .line 1068
    .line 1069
    const/4 v9, 0x0

    .line 1070
    :goto_2f
    if-ge v9, v5, :cond_48

    .line 1071
    .line 1072
    add-int/lit8 v10, v9, 0x1

    .line 1073
    .line 1074
    move v13, v10

    .line 1075
    :goto_30
    if-ge v13, v6, :cond_47

    .line 1076
    .line 1077
    aget-object v24, v20, v13

    .line 1078
    .line 1079
    aget-boolean v24, v24, v9

    .line 1080
    .line 1081
    if-eqz v24, :cond_46

    .line 1082
    .line 1083
    move/from16 v24, v5

    .line 1084
    .line 1085
    const/4 v5, 0x3

    .line 1086
    invoke-virtual {v0, v5}, Lp4/r;->t(I)V

    .line 1087
    .line 1088
    .line 1089
    goto :goto_31

    .line 1090
    :cond_46
    move/from16 v24, v5

    .line 1091
    .line 1092
    :goto_31
    add-int/lit8 v13, v13, 0x1

    .line 1093
    .line 1094
    move/from16 v5, v24

    .line 1095
    .line 1096
    goto :goto_30

    .line 1097
    :cond_47
    move v9, v10

    .line 1098
    goto :goto_2f

    .line 1099
    :cond_48
    invoke-virtual {v0}, Lp4/r;->s()V

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 1103
    .line 1104
    .line 1105
    move-result v5

    .line 1106
    const/4 v10, 0x1

    .line 1107
    add-int/2addr v5, v10

    .line 1108
    invoke-static {}, Lya/i0;->p()Lya/f0;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v9

    .line 1112
    invoke-virtual {v9, v11}, Lya/c0;->a(Ljava/lang/Object;)V

    .line 1113
    .line 1114
    .line 1115
    if-le v5, v10, :cond_49

    .line 1116
    .line 1117
    invoke-virtual {v9, v2}, Lya/c0;->a(Ljava/lang/Object;)V

    .line 1118
    .line 1119
    .line 1120
    const/4 v10, 0x2

    .line 1121
    :goto_32
    if-ge v10, v5, :cond_49

    .line 1122
    .line 1123
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 1124
    .line 1125
    .line 1126
    move-result v11

    .line 1127
    invoke-static {v0, v11, v8, v2}, Lq4/p;->f(Lp4/r;ZILq4/h;)Lq4/h;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v2

    .line 1131
    invoke-virtual {v9, v2}, Lya/c0;->a(Ljava/lang/Object;)V

    .line 1132
    .line 1133
    .line 1134
    add-int/lit8 v10, v10, 0x1

    .line 1135
    .line 1136
    goto :goto_32

    .line 1137
    :cond_49
    invoke-virtual {v9}, Lya/f0;->f()Lya/a1;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v2

    .line 1141
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 1142
    .line 1143
    .line 1144
    move-result v8

    .line 1145
    add-int/2addr v8, v14

    .line 1146
    if-le v8, v14, :cond_4a

    .line 1147
    .line 1148
    new-instance v0, Lb0/w1;

    .line 1149
    .line 1150
    const/4 v1, 0x0

    .line 1151
    invoke-direct {v0, v1, v4, v1, v1}, Lb0/w1;-><init>(Lya/a1;Lq4/i;Lq4/i;Lq4/i;)V

    .line 1152
    .line 1153
    .line 1154
    return-object v0

    .line 1155
    :cond_4a
    const/4 v9, 0x2

    .line 1156
    invoke-virtual {v0, v9}, Lp4/r;->i(I)I

    .line 1157
    .line 1158
    .line 1159
    move-result v10

    .line 1160
    new-array v11, v9, [I

    .line 1161
    .line 1162
    const/16 v27, 0x1

    .line 1163
    .line 1164
    aput v3, v11, v27

    .line 1165
    .line 1166
    const/4 v9, 0x0

    .line 1167
    aput v8, v11, v9

    .line 1168
    .line 1169
    invoke-static {v12, v11}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v11

    .line 1173
    check-cast v11, [[Z

    .line 1174
    .line 1175
    new-array v13, v8, [I

    .line 1176
    .line 1177
    const/16 v17, 0x0

    .line 1178
    .line 1179
    new-array v9, v8, [I

    .line 1180
    .line 1181
    move-object/from16 v24, v9

    .line 1182
    .line 1183
    const/4 v9, 0x0

    .line 1184
    :goto_33
    if-ge v9, v14, :cond_4f

    .line 1185
    .line 1186
    aput v17, v13, v9

    .line 1187
    .line 1188
    aget v27, v26, v9

    .line 1189
    .line 1190
    aput v27, v24, v9

    .line 1191
    .line 1192
    if-nez v10, :cond_4b

    .line 1193
    .line 1194
    move/from16 v27, v9

    .line 1195
    .line 1196
    aget-object v9, v11, v27

    .line 1197
    .line 1198
    move-object/from16 v30, v11

    .line 1199
    .line 1200
    aget v11, v15, v27

    .line 1201
    .line 1202
    move-object/from16 v31, v13

    .line 1203
    .line 1204
    move-object/from16 v32, v15

    .line 1205
    .line 1206
    const/4 v13, 0x0

    .line 1207
    const/4 v15, 0x1

    .line 1208
    invoke-static {v9, v13, v11, v15}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1209
    .line 1210
    .line 1211
    aget v9, v32, v27

    .line 1212
    .line 1213
    aput v9, v31, v27

    .line 1214
    .line 1215
    :goto_34
    const/16 v17, 0x0

    .line 1216
    .line 1217
    goto :goto_37

    .line 1218
    :cond_4b
    move/from16 v27, v9

    .line 1219
    .line 1220
    move-object/from16 v30, v11

    .line 1221
    .line 1222
    move-object/from16 v31, v13

    .line 1223
    .line 1224
    move-object/from16 v32, v15

    .line 1225
    .line 1226
    const/4 v15, 0x1

    .line 1227
    if-ne v10, v15, :cond_4e

    .line 1228
    .line 1229
    aget v9, v26, v27

    .line 1230
    .line 1231
    const/4 v11, 0x0

    .line 1232
    :goto_35
    aget v13, v32, v27

    .line 1233
    .line 1234
    if-ge v11, v13, :cond_4d

    .line 1235
    .line 1236
    aget-object v13, v30, v27

    .line 1237
    .line 1238
    aget-object v15, v25, v27

    .line 1239
    .line 1240
    aget v15, v15, v11

    .line 1241
    .line 1242
    if-ne v15, v9, :cond_4c

    .line 1243
    .line 1244
    const/4 v15, 0x1

    .line 1245
    goto :goto_36

    .line 1246
    :cond_4c
    const/4 v15, 0x0

    .line 1247
    :goto_36
    aput-boolean v15, v13, v11

    .line 1248
    .line 1249
    add-int/lit8 v11, v11, 0x1

    .line 1250
    .line 1251
    goto :goto_35

    .line 1252
    :cond_4d
    const/4 v15, 0x1

    .line 1253
    aput v15, v31, v27

    .line 1254
    .line 1255
    goto :goto_34

    .line 1256
    :cond_4e
    const/16 v17, 0x0

    .line 1257
    .line 1258
    aget-object v9, v30, v17

    .line 1259
    .line 1260
    aput-boolean v15, v9, v17

    .line 1261
    .line 1262
    aput v15, v31, v17

    .line 1263
    .line 1264
    :goto_37
    add-int/lit8 v9, v27, 0x1

    .line 1265
    .line 1266
    move-object/from16 v11, v30

    .line 1267
    .line 1268
    move-object/from16 v13, v31

    .line 1269
    .line 1270
    move-object/from16 v15, v32

    .line 1271
    .line 1272
    goto :goto_33

    .line 1273
    :cond_4f
    move-object/from16 v30, v11

    .line 1274
    .line 1275
    move-object/from16 v31, v13

    .line 1276
    .line 1277
    move-object/from16 v32, v15

    .line 1278
    .line 1279
    const/4 v15, 0x1

    .line 1280
    new-array v9, v3, [I

    .line 1281
    .line 1282
    const/4 v11, 0x2

    .line 1283
    new-array v13, v11, [I

    .line 1284
    .line 1285
    aput v3, v13, v15

    .line 1286
    .line 1287
    aput v8, v13, v17

    .line 1288
    .line 1289
    invoke-static {v12, v13}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v3

    .line 1293
    check-cast v3, [[Z

    .line 1294
    .line 1295
    const/4 v12, 0x1

    .line 1296
    const/4 v13, 0x0

    .line 1297
    :goto_38
    if-ge v12, v8, :cond_5c

    .line 1298
    .line 1299
    if-ne v10, v11, :cond_51

    .line 1300
    .line 1301
    const/4 v11, 0x0

    .line 1302
    :goto_39
    aget v15, v32, v12

    .line 1303
    .line 1304
    if-ge v11, v15, :cond_51

    .line 1305
    .line 1306
    aget-object v15, v30, v12

    .line 1307
    .line 1308
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 1309
    .line 1310
    .line 1311
    move-result v26

    .line 1312
    aput-boolean v26, v15, v11

    .line 1313
    .line 1314
    aget v15, v31, v12

    .line 1315
    .line 1316
    aget-object v26, v30, v12

    .line 1317
    .line 1318
    aget-boolean v26, v26, v11

    .line 1319
    .line 1320
    add-int v15, v15, v26

    .line 1321
    .line 1322
    aput v15, v31, v12

    .line 1323
    .line 1324
    if-eqz v26, :cond_50

    .line 1325
    .line 1326
    aget-object v15, v25, v12

    .line 1327
    .line 1328
    aget v15, v15, v11

    .line 1329
    .line 1330
    aput v15, v24, v12

    .line 1331
    .line 1332
    :cond_50
    add-int/lit8 v11, v11, 0x1

    .line 1333
    .line 1334
    goto :goto_39

    .line 1335
    :cond_51
    if-nez v13, :cond_53

    .line 1336
    .line 1337
    aget-object v11, v25, v12

    .line 1338
    .line 1339
    const/16 v17, 0x0

    .line 1340
    .line 1341
    aget v11, v11, v17

    .line 1342
    .line 1343
    if-nez v11, :cond_54

    .line 1344
    .line 1345
    aget-object v11, v30, v12

    .line 1346
    .line 1347
    aget-boolean v11, v11, v17

    .line 1348
    .line 1349
    if-eqz v11, :cond_54

    .line 1350
    .line 1351
    const/4 v11, 0x1

    .line 1352
    :goto_3a
    aget v15, v32, v12

    .line 1353
    .line 1354
    if-ge v11, v15, :cond_54

    .line 1355
    .line 1356
    aget-object v15, v25, v12

    .line 1357
    .line 1358
    aget v15, v15, v11

    .line 1359
    .line 1360
    if-ne v15, v7, :cond_52

    .line 1361
    .line 1362
    aget-object v15, v30, v12

    .line 1363
    .line 1364
    aget-boolean v15, v15, v7

    .line 1365
    .line 1366
    if-eqz v15, :cond_52

    .line 1367
    .line 1368
    move v13, v12

    .line 1369
    :cond_52
    add-int/lit8 v11, v11, 0x1

    .line 1370
    .line 1371
    goto :goto_3a

    .line 1372
    :cond_53
    const/16 v17, 0x0

    .line 1373
    .line 1374
    :cond_54
    const/4 v11, 0x0

    .line 1375
    :goto_3b
    aget v15, v32, v12

    .line 1376
    .line 1377
    if-ge v11, v15, :cond_5a

    .line 1378
    .line 1379
    const/4 v15, 0x1

    .line 1380
    if-le v5, v15, :cond_58

    .line 1381
    .line 1382
    aget-object v15, v3, v12

    .line 1383
    .line 1384
    aget-object v26, v30, v12

    .line 1385
    .line 1386
    aget-boolean v26, v26, v11

    .line 1387
    .line 1388
    aput-boolean v26, v15, v11

    .line 1389
    .line 1390
    move-object v15, v2

    .line 1391
    move-object/from16 v26, v3

    .line 1392
    .line 1393
    int-to-double v2, v5

    .line 1394
    sget-object v27, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 1395
    .line 1396
    invoke-static {v2, v3}, Lab/c;->c(D)I

    .line 1397
    .line 1398
    .line 1399
    move-result v2

    .line 1400
    aget-object v3, v26, v12

    .line 1401
    .line 1402
    aget-boolean v3, v3, v11

    .line 1403
    .line 1404
    if-nez v3, :cond_56

    .line 1405
    .line 1406
    aget-object v3, v25, v12

    .line 1407
    .line 1408
    aget v3, v3, v11

    .line 1409
    .line 1410
    invoke-virtual {v1, v3}, Lya/a1;->get(I)Ljava/lang/Object;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v3

    .line 1414
    check-cast v3, Lq4/g;

    .line 1415
    .line 1416
    iget v3, v3, Lq4/g;->a:I

    .line 1417
    .line 1418
    move/from16 v27, v3

    .line 1419
    .line 1420
    const/4 v3, 0x0

    .line 1421
    :goto_3c
    if-ge v3, v11, :cond_56

    .line 1422
    .line 1423
    aget-object v33, v25, v12

    .line 1424
    .line 1425
    move/from16 v34, v3

    .line 1426
    .line 1427
    aget v3, v33, v34

    .line 1428
    .line 1429
    invoke-virtual {v1, v3}, Lya/a1;->get(I)Ljava/lang/Object;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v3

    .line 1433
    check-cast v3, Lq4/g;

    .line 1434
    .line 1435
    iget v3, v3, Lq4/g;->a:I

    .line 1436
    .line 1437
    aget-object v33, p0, v27

    .line 1438
    .line 1439
    aget-boolean v3, v33, v3

    .line 1440
    .line 1441
    if-eqz v3, :cond_55

    .line 1442
    .line 1443
    aget-object v3, v26, v12

    .line 1444
    .line 1445
    const/16 v27, 0x1

    .line 1446
    .line 1447
    aput-boolean v27, v3, v11

    .line 1448
    .line 1449
    goto :goto_3d

    .line 1450
    :cond_55
    add-int/lit8 v3, v34, 0x1

    .line 1451
    .line 1452
    goto :goto_3c

    .line 1453
    :cond_56
    :goto_3d
    aget-object v3, v26, v12

    .line 1454
    .line 1455
    aget-boolean v3, v3, v11

    .line 1456
    .line 1457
    if-eqz v3, :cond_59

    .line 1458
    .line 1459
    if-lez v13, :cond_57

    .line 1460
    .line 1461
    if-ne v12, v13, :cond_57

    .line 1462
    .line 1463
    invoke-virtual {v0, v2}, Lp4/r;->i(I)I

    .line 1464
    .line 1465
    .line 1466
    move-result v2

    .line 1467
    aput v2, v9, v11

    .line 1468
    .line 1469
    goto :goto_3e

    .line 1470
    :cond_57
    invoke-virtual {v0, v2}, Lp4/r;->t(I)V

    .line 1471
    .line 1472
    .line 1473
    goto :goto_3e

    .line 1474
    :cond_58
    move-object v15, v2

    .line 1475
    move-object/from16 v26, v3

    .line 1476
    .line 1477
    :cond_59
    :goto_3e
    add-int/lit8 v11, v11, 0x1

    .line 1478
    .line 1479
    move-object v2, v15

    .line 1480
    move-object/from16 v3, v26

    .line 1481
    .line 1482
    goto :goto_3b

    .line 1483
    :cond_5a
    move-object v15, v2

    .line 1484
    move-object/from16 v26, v3

    .line 1485
    .line 1486
    aget v2, v31, v12

    .line 1487
    .line 1488
    const/4 v3, 0x1

    .line 1489
    if-ne v2, v3, :cond_5b

    .line 1490
    .line 1491
    aget v2, v24, v12

    .line 1492
    .line 1493
    aget v2, v22, v2

    .line 1494
    .line 1495
    if-lez v2, :cond_5b

    .line 1496
    .line 1497
    invoke-virtual {v0}, Lp4/r;->s()V

    .line 1498
    .line 1499
    .line 1500
    :cond_5b
    add-int/lit8 v12, v12, 0x1

    .line 1501
    .line 1502
    move-object v2, v15

    .line 1503
    move-object/from16 v3, v26

    .line 1504
    .line 1505
    const/4 v11, 0x2

    .line 1506
    goto/16 :goto_38

    .line 1507
    .line 1508
    :cond_5c
    move-object v15, v2

    .line 1509
    move-object/from16 v26, v3

    .line 1510
    .line 1511
    const/16 v17, 0x0

    .line 1512
    .line 1513
    if-nez v13, :cond_5d

    .line 1514
    .line 1515
    new-instance v0, Lb0/w1;

    .line 1516
    .line 1517
    const/4 v1, 0x0

    .line 1518
    invoke-direct {v0, v1, v4, v1, v1}, Lb0/w1;-><init>(Lya/a1;Lq4/i;Lq4/i;Lq4/i;)V

    .line 1519
    .line 1520
    .line 1521
    return-object v0

    .line 1522
    :cond_5d
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 1523
    .line 1524
    .line 1525
    move-result v2

    .line 1526
    add-int/lit8 v3, v2, 0x1

    .line 1527
    .line 1528
    const-string v4, "expectedSize"

    .line 1529
    .line 1530
    invoke-static {v3, v4}, Lya/q;->d(ILjava/lang/String;)V

    .line 1531
    .line 1532
    .line 1533
    const-string v5, "initialCapacity"

    .line 1534
    .line 1535
    invoke-static {v3, v5}, Lya/q;->d(ILjava/lang/String;)V

    .line 1536
    .line 1537
    .line 1538
    new-array v7, v3, [Ljava/lang/Object;

    .line 1539
    .line 1540
    new-array v10, v6, [I

    .line 1541
    .line 1542
    move-object v13, v7

    .line 1543
    const/4 v7, 0x0

    .line 1544
    const/4 v11, 0x0

    .line 1545
    const/4 v12, 0x0

    .line 1546
    :goto_3f
    if-ge v7, v3, :cond_66

    .line 1547
    .line 1548
    move/from16 v24, v7

    .line 1549
    .line 1550
    const/16 v7, 0x10

    .line 1551
    .line 1552
    invoke-virtual {v0, v7}, Lp4/r;->i(I)I

    .line 1553
    .line 1554
    .line 1555
    move-result v21

    .line 1556
    invoke-virtual {v0, v7}, Lp4/r;->i(I)I

    .line 1557
    .line 1558
    .line 1559
    move-result v25

    .line 1560
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 1561
    .line 1562
    .line 1563
    move-result v27

    .line 1564
    move/from16 p0, v12

    .line 1565
    .line 1566
    if-eqz v27, :cond_5f

    .line 1567
    .line 1568
    const/4 v7, 0x2

    .line 1569
    invoke-virtual {v0, v7}, Lp4/r;->i(I)I

    .line 1570
    .line 1571
    .line 1572
    move-result v12

    .line 1573
    const/4 v7, 0x3

    .line 1574
    if-ne v12, v7, :cond_5e

    .line 1575
    .line 1576
    invoke-virtual {v0}, Lp4/r;->s()V

    .line 1577
    .line 1578
    .line 1579
    :cond_5e
    const/4 v7, 0x4

    .line 1580
    invoke-virtual {v0, v7}, Lp4/r;->i(I)I

    .line 1581
    .line 1582
    .line 1583
    move-result v30

    .line 1584
    invoke-virtual {v0, v7}, Lp4/r;->i(I)I

    .line 1585
    .line 1586
    .line 1587
    move-result v31

    .line 1588
    move/from16 v35, v30

    .line 1589
    .line 1590
    move/from16 v36, v31

    .line 1591
    .line 1592
    goto :goto_40

    .line 1593
    :cond_5f
    const/4 v12, 0x0

    .line 1594
    const/16 v35, 0x0

    .line 1595
    .line 1596
    const/16 v36, 0x0

    .line 1597
    .line 1598
    :goto_40
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 1599
    .line 1600
    .line 1601
    move-result v7

    .line 1602
    if-eqz v7, :cond_63

    .line 1603
    .line 1604
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 1605
    .line 1606
    .line 1607
    move-result v7

    .line 1608
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 1609
    .line 1610
    .line 1611
    move-result v30

    .line 1612
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 1613
    .line 1614
    .line 1615
    move-result v31

    .line 1616
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 1617
    .line 1618
    .line 1619
    move-result v33

    .line 1620
    move/from16 v34, v7

    .line 1621
    .line 1622
    const/4 v7, 0x1

    .line 1623
    if-eq v12, v7, :cond_61

    .line 1624
    .line 1625
    const/4 v7, 0x2

    .line 1626
    if-ne v12, v7, :cond_60

    .line 1627
    .line 1628
    goto :goto_41

    .line 1629
    :cond_60
    const/4 v7, 0x1

    .line 1630
    goto :goto_42

    .line 1631
    :cond_61
    :goto_41
    const/4 v7, 0x2

    .line 1632
    :goto_42
    add-int v30, v34, v30

    .line 1633
    .line 1634
    mul-int v30, v30, v7

    .line 1635
    .line 1636
    sub-int v21, v21, v30

    .line 1637
    .line 1638
    const/4 v7, 0x1

    .line 1639
    if-ne v12, v7, :cond_62

    .line 1640
    .line 1641
    const/4 v7, 0x2

    .line 1642
    goto :goto_43

    .line 1643
    :cond_62
    const/4 v7, 0x1

    .line 1644
    :goto_43
    add-int v31, v31, v33

    .line 1645
    .line 1646
    mul-int v31, v31, v7

    .line 1647
    .line 1648
    sub-int v25, v25, v31

    .line 1649
    .line 1650
    :cond_63
    move/from16 v37, v21

    .line 1651
    .line 1652
    move/from16 v38, v25

    .line 1653
    .line 1654
    new-instance v33, Lq4/j;

    .line 1655
    .line 1656
    move/from16 v34, v12

    .line 1657
    .line 1658
    invoke-direct/range {v33 .. v38}, Lq4/j;-><init>(IIIII)V

    .line 1659
    .line 1660
    .line 1661
    array-length v7, v13

    .line 1662
    add-int/lit8 v12, v11, 0x1

    .line 1663
    .line 1664
    invoke-static {v7, v12}, Lya/c0;->e(II)I

    .line 1665
    .line 1666
    .line 1667
    move-result v7

    .line 1668
    array-length v12, v13

    .line 1669
    if-gt v7, v12, :cond_65

    .line 1670
    .line 1671
    if-eqz p0, :cond_64

    .line 1672
    .line 1673
    goto :goto_44

    .line 1674
    :cond_64
    move/from16 v12, p0

    .line 1675
    .line 1676
    goto :goto_45

    .line 1677
    :cond_65
    :goto_44
    invoke-static {v13, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v7

    .line 1681
    move-object v13, v7

    .line 1682
    const/4 v12, 0x0

    .line 1683
    :goto_45
    add-int/lit8 v7, v11, 0x1

    .line 1684
    .line 1685
    aput-object v33, v13, v11

    .line 1686
    .line 1687
    add-int/lit8 v11, v24, 0x1

    .line 1688
    .line 1689
    move/from16 v39, v11

    .line 1690
    .line 1691
    move v11, v7

    .line 1692
    move/from16 v7, v39

    .line 1693
    .line 1694
    goto/16 :goto_3f

    .line 1695
    .line 1696
    :cond_66
    const/4 v7, 0x1

    .line 1697
    if-le v3, v7, :cond_67

    .line 1698
    .line 1699
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 1700
    .line 1701
    .line 1702
    move-result v7

    .line 1703
    if-eqz v7, :cond_67

    .line 1704
    .line 1705
    int-to-double v2, v3

    .line 1706
    sget-object v7, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    .line 1707
    .line 1708
    invoke-static {v2, v3}, Lab/c;->c(D)I

    .line 1709
    .line 1710
    .line 1711
    move-result v2

    .line 1712
    const/4 v3, 0x1

    .line 1713
    :goto_46
    if-ge v3, v6, :cond_68

    .line 1714
    .line 1715
    invoke-virtual {v0, v2}, Lp4/r;->i(I)I

    .line 1716
    .line 1717
    .line 1718
    move-result v7

    .line 1719
    aput v7, v10, v3

    .line 1720
    .line 1721
    add-int/lit8 v3, v3, 0x1

    .line 1722
    .line 1723
    goto :goto_46

    .line 1724
    :cond_67
    const/4 v3, 0x1

    .line 1725
    :goto_47
    if-ge v3, v6, :cond_68

    .line 1726
    .line 1727
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 1728
    .line 1729
    .line 1730
    move-result v7

    .line 1731
    aput v7, v10, v3

    .line 1732
    .line 1733
    add-int/lit8 v3, v3, 0x1

    .line 1734
    .line 1735
    goto :goto_47

    .line 1736
    :cond_68
    new-instance v2, Lq4/i;

    .line 1737
    .line 1738
    invoke-static {v11, v13}, Lya/i0;->o(I[Ljava/lang/Object;)Lya/a1;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v3

    .line 1742
    const/4 v7, 0x1

    .line 1743
    invoke-direct {v2, v3, v10, v7}, Lq4/i;-><init>(Lya/a1;[II)V

    .line 1744
    .line 1745
    .line 1746
    const/4 v7, 0x2

    .line 1747
    invoke-virtual {v0, v7}, Lp4/r;->t(I)V

    .line 1748
    .line 1749
    .line 1750
    const/4 v3, 0x1

    .line 1751
    :goto_48
    if-ge v3, v6, :cond_6a

    .line 1752
    .line 1753
    aget v7, v28, v3

    .line 1754
    .line 1755
    aget v7, v22, v7

    .line 1756
    .line 1757
    if-nez v7, :cond_69

    .line 1758
    .line 1759
    invoke-virtual {v0}, Lp4/r;->s()V

    .line 1760
    .line 1761
    .line 1762
    :cond_69
    add-int/lit8 v3, v3, 0x1

    .line 1763
    .line 1764
    goto :goto_48

    .line 1765
    :cond_6a
    const/4 v3, 0x1

    .line 1766
    :goto_49
    if-ge v3, v8, :cond_71

    .line 1767
    .line 1768
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 1769
    .line 1770
    .line 1771
    move-result v7

    .line 1772
    const/4 v10, 0x0

    .line 1773
    :goto_4a
    aget v11, v29, v3

    .line 1774
    .line 1775
    if-ge v10, v11, :cond_70

    .line 1776
    .line 1777
    if-lez v10, :cond_6b

    .line 1778
    .line 1779
    if-eqz v7, :cond_6b

    .line 1780
    .line 1781
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 1782
    .line 1783
    .line 1784
    move-result v11

    .line 1785
    goto :goto_4b

    .line 1786
    :cond_6b
    if-nez v10, :cond_6c

    .line 1787
    .line 1788
    const/4 v11, 0x1

    .line 1789
    goto :goto_4b

    .line 1790
    :cond_6c
    const/4 v11, 0x0

    .line 1791
    :goto_4b
    if-eqz v11, :cond_6f

    .line 1792
    .line 1793
    const/4 v11, 0x0

    .line 1794
    :goto_4c
    aget v12, v32, v3

    .line 1795
    .line 1796
    if-ge v11, v12, :cond_6e

    .line 1797
    .line 1798
    aget-object v12, v26, v3

    .line 1799
    .line 1800
    aget-boolean v12, v12, v11

    .line 1801
    .line 1802
    if-eqz v12, :cond_6d

    .line 1803
    .line 1804
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 1805
    .line 1806
    .line 1807
    :cond_6d
    add-int/lit8 v11, v11, 0x1

    .line 1808
    .line 1809
    goto :goto_4c

    .line 1810
    :cond_6e
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 1811
    .line 1812
    .line 1813
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 1814
    .line 1815
    .line 1816
    :cond_6f
    add-int/lit8 v10, v10, 0x1

    .line 1817
    .line 1818
    goto :goto_4a

    .line 1819
    :cond_70
    add-int/lit8 v3, v3, 0x1

    .line 1820
    .line 1821
    goto :goto_49

    .line 1822
    :cond_71
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 1823
    .line 1824
    .line 1825
    move-result v3

    .line 1826
    const/16 v16, 0x2

    .line 1827
    .line 1828
    add-int/lit8 v3, v3, 0x2

    .line 1829
    .line 1830
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 1831
    .line 1832
    .line 1833
    move-result v7

    .line 1834
    if-eqz v7, :cond_72

    .line 1835
    .line 1836
    invoke-virtual {v0, v3}, Lp4/r;->t(I)V

    .line 1837
    .line 1838
    .line 1839
    goto :goto_4f

    .line 1840
    :cond_72
    const/4 v7, 0x1

    .line 1841
    :goto_4d
    if-ge v7, v6, :cond_75

    .line 1842
    .line 1843
    const/4 v8, 0x0

    .line 1844
    :goto_4e
    if-ge v8, v7, :cond_74

    .line 1845
    .line 1846
    aget-object v10, v20, v7

    .line 1847
    .line 1848
    aget-boolean v10, v10, v8

    .line 1849
    .line 1850
    if-eqz v10, :cond_73

    .line 1851
    .line 1852
    invoke-virtual {v0, v3}, Lp4/r;->t(I)V

    .line 1853
    .line 1854
    .line 1855
    :cond_73
    add-int/lit8 v8, v8, 0x1

    .line 1856
    .line 1857
    goto :goto_4e

    .line 1858
    :cond_74
    add-int/lit8 v7, v7, 0x1

    .line 1859
    .line 1860
    goto :goto_4d

    .line 1861
    :cond_75
    :goto_4f
    invoke-virtual {v0}, Lp4/r;->m()I

    .line 1862
    .line 1863
    .line 1864
    move-result v3

    .line 1865
    const/4 v7, 0x1

    .line 1866
    :goto_50
    if-gt v7, v3, :cond_76

    .line 1867
    .line 1868
    const/16 v13, 0x8

    .line 1869
    .line 1870
    invoke-virtual {v0, v13}, Lp4/r;->t(I)V

    .line 1871
    .line 1872
    .line 1873
    add-int/lit8 v7, v7, 0x1

    .line 1874
    .line 1875
    goto :goto_50

    .line 1876
    :cond_76
    const/16 v13, 0x8

    .line 1877
    .line 1878
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 1879
    .line 1880
    .line 1881
    move-result v3

    .line 1882
    if-eqz v3, :cond_87

    .line 1883
    .line 1884
    iget v3, v0, Lp4/r;->e:I

    .line 1885
    .line 1886
    if-lez v3, :cond_77

    .line 1887
    .line 1888
    rsub-int/lit8 v3, v3, 0x8

    .line 1889
    .line 1890
    invoke-virtual {v0, v3}, Lp4/r;->t(I)V

    .line 1891
    .line 1892
    .line 1893
    :cond_77
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 1894
    .line 1895
    .line 1896
    move-result v3

    .line 1897
    if-nez v3, :cond_78

    .line 1898
    .line 1899
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 1900
    .line 1901
    .line 1902
    move-result v3

    .line 1903
    goto :goto_51

    .line 1904
    :cond_78
    const/4 v3, 0x1

    .line 1905
    :goto_51
    if-eqz v3, :cond_79

    .line 1906
    .line 1907
    invoke-virtual {v0}, Lp4/r;->s()V

    .line 1908
    .line 1909
    .line 1910
    :cond_79
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 1911
    .line 1912
    .line 1913
    move-result v3

    .line 1914
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 1915
    .line 1916
    .line 1917
    move-result v7

    .line 1918
    if-nez v3, :cond_7a

    .line 1919
    .line 1920
    if-eqz v7, :cond_80

    .line 1921
    .line 1922
    :cond_7a
    const/4 v8, 0x0

    .line 1923
    :goto_52
    if-ge v8, v14, :cond_80

    .line 1924
    .line 1925
    const/4 v10, 0x0

    .line 1926
    :goto_53
    aget v11, v29, v8

    .line 1927
    .line 1928
    if-ge v10, v11, :cond_7f

    .line 1929
    .line 1930
    if-eqz v3, :cond_7b

    .line 1931
    .line 1932
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 1933
    .line 1934
    .line 1935
    move-result v11

    .line 1936
    goto :goto_54

    .line 1937
    :cond_7b
    const/4 v11, 0x0

    .line 1938
    :goto_54
    if-eqz v7, :cond_7c

    .line 1939
    .line 1940
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 1941
    .line 1942
    .line 1943
    move-result v12

    .line 1944
    goto :goto_55

    .line 1945
    :cond_7c
    const/4 v12, 0x0

    .line 1946
    :goto_55
    if-eqz v11, :cond_7d

    .line 1947
    .line 1948
    const/16 v11, 0x20

    .line 1949
    .line 1950
    invoke-virtual {v0, v11}, Lp4/r;->t(I)V

    .line 1951
    .line 1952
    .line 1953
    :cond_7d
    if-eqz v12, :cond_7e

    .line 1954
    .line 1955
    const/16 v11, 0x12

    .line 1956
    .line 1957
    invoke-virtual {v0, v11}, Lp4/r;->t(I)V

    .line 1958
    .line 1959
    .line 1960
    :cond_7e
    add-int/lit8 v10, v10, 0x1

    .line 1961
    .line 1962
    goto :goto_53

    .line 1963
    :cond_7f
    add-int/lit8 v8, v8, 0x1

    .line 1964
    .line 1965
    goto :goto_52

    .line 1966
    :cond_80
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 1967
    .line 1968
    .line 1969
    move-result v3

    .line 1970
    if-eqz v3, :cond_81

    .line 1971
    .line 1972
    const/4 v13, 0x4

    .line 1973
    invoke-virtual {v0, v13}, Lp4/r;->i(I)I

    .line 1974
    .line 1975
    .line 1976
    move-result v7

    .line 1977
    const/16 v27, 0x1

    .line 1978
    .line 1979
    add-int/lit8 v7, v7, 0x1

    .line 1980
    .line 1981
    goto :goto_56

    .line 1982
    :cond_81
    move v7, v6

    .line 1983
    :goto_56
    invoke-static {v7, v4}, Lya/q;->d(ILjava/lang/String;)V

    .line 1984
    .line 1985
    .line 1986
    invoke-static {v7, v5}, Lya/q;->d(ILjava/lang/String;)V

    .line 1987
    .line 1988
    .line 1989
    new-array v4, v7, [Ljava/lang/Object;

    .line 1990
    .line 1991
    new-array v5, v6, [I

    .line 1992
    .line 1993
    move-object v11, v4

    .line 1994
    const/4 v4, 0x0

    .line 1995
    const/4 v8, 0x0

    .line 1996
    const/4 v10, 0x0

    .line 1997
    :goto_57
    if-ge v4, v7, :cond_85

    .line 1998
    .line 1999
    const/4 v12, 0x3

    .line 2000
    invoke-virtual {v0, v12}, Lp4/r;->t(I)V

    .line 2001
    .line 2002
    .line 2003
    invoke-virtual {v0}, Lp4/r;->h()Z

    .line 2004
    .line 2005
    .line 2006
    move-result v13

    .line 2007
    if-eqz v13, :cond_82

    .line 2008
    .line 2009
    const/4 v13, 0x1

    .line 2010
    :goto_58
    const/16 v14, 0x8

    .line 2011
    .line 2012
    goto :goto_59

    .line 2013
    :cond_82
    const/4 v13, 0x2

    .line 2014
    goto :goto_58

    .line 2015
    :goto_59
    invoke-virtual {v0, v14}, Lp4/r;->i(I)I

    .line 2016
    .line 2017
    .line 2018
    move-result v18

    .line 2019
    invoke-static/range {v18 .. v18}, Lm4/h;->f(I)I

    .line 2020
    .line 2021
    .line 2022
    move-result v12

    .line 2023
    invoke-virtual {v0, v14}, Lp4/r;->i(I)I

    .line 2024
    .line 2025
    .line 2026
    move-result v18

    .line 2027
    move/from16 p0, v3

    .line 2028
    .line 2029
    invoke-static/range {v18 .. v18}, Lm4/h;->g(I)I

    .line 2030
    .line 2031
    .line 2032
    move-result v3

    .line 2033
    invoke-virtual {v0, v14}, Lp4/r;->t(I)V

    .line 2034
    .line 2035
    .line 2036
    new-instance v14, Lq4/m;

    .line 2037
    .line 2038
    invoke-direct {v14, v12, v13, v3}, Lq4/m;-><init>(III)V

    .line 2039
    .line 2040
    .line 2041
    array-length v3, v11

    .line 2042
    add-int/lit8 v12, v8, 0x1

    .line 2043
    .line 2044
    invoke-static {v3, v12}, Lya/c0;->e(II)I

    .line 2045
    .line 2046
    .line 2047
    move-result v3

    .line 2048
    array-length v12, v11

    .line 2049
    if-gt v3, v12, :cond_83

    .line 2050
    .line 2051
    if-eqz v10, :cond_84

    .line 2052
    .line 2053
    :cond_83
    invoke-static {v11, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2054
    .line 2055
    .line 2056
    move-result-object v3

    .line 2057
    move-object v11, v3

    .line 2058
    const/4 v10, 0x0

    .line 2059
    :cond_84
    add-int/lit8 v3, v8, 0x1

    .line 2060
    .line 2061
    aput-object v14, v11, v8

    .line 2062
    .line 2063
    add-int/lit8 v4, v4, 0x1

    .line 2064
    .line 2065
    move v8, v3

    .line 2066
    move/from16 v3, p0

    .line 2067
    .line 2068
    goto :goto_57

    .line 2069
    :cond_85
    move/from16 p0, v3

    .line 2070
    .line 2071
    if-eqz p0, :cond_86

    .line 2072
    .line 2073
    const/4 v10, 0x1

    .line 2074
    if-le v7, v10, :cond_86

    .line 2075
    .line 2076
    const/4 v13, 0x0

    .line 2077
    :goto_5a
    if-ge v13, v6, :cond_86

    .line 2078
    .line 2079
    const/4 v7, 0x4

    .line 2080
    invoke-virtual {v0, v7}, Lp4/r;->i(I)I

    .line 2081
    .line 2082
    .line 2083
    move-result v3

    .line 2084
    aput v3, v5, v13

    .line 2085
    .line 2086
    add-int/lit8 v13, v13, 0x1

    .line 2087
    .line 2088
    goto :goto_5a

    .line 2089
    :cond_86
    new-instance v10, Lq4/i;

    .line 2090
    .line 2091
    invoke-static {v8, v11}, Lya/i0;->o(I[Ljava/lang/Object;)Lya/a1;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v0

    .line 2095
    const/4 v3, 0x2

    .line 2096
    invoke-direct {v10, v0, v5, v3}, Lq4/i;-><init>(Lya/a1;[II)V

    .line 2097
    .line 2098
    .line 2099
    goto :goto_5b

    .line 2100
    :cond_87
    const/4 v10, 0x0

    .line 2101
    :goto_5b
    new-instance v0, Lb0/w1;

    .line 2102
    .line 2103
    new-instance v3, Lq4/i;

    .line 2104
    .line 2105
    const/4 v4, 0x0

    .line 2106
    invoke-direct {v3, v15, v9, v4}, Lq4/i;-><init>(Lya/a1;[II)V

    .line 2107
    .line 2108
    .line 2109
    invoke-direct {v0, v1, v3, v2, v10}, Lb0/w1;-><init>(Lya/a1;Lq4/i;Lq4/i;Lq4/i;)V

    .line 2110
    .line 2111
    .line 2112
    return-object v0

    .line 2113
    :cond_88
    :goto_5c
    new-instance v0, Lb0/w1;

    .line 2114
    .line 2115
    const/4 v1, 0x0

    .line 2116
    invoke-direct {v0, v1, v4, v1, v1}, Lb0/w1;-><init>(Lya/a1;Lq4/i;Lq4/i;Lq4/i;)V

    .line 2117
    .line 2118
    .line 2119
    return-object v0

    .line 2120
    :goto_5d
    new-instance v0, Lb0/w1;

    .line 2121
    .line 2122
    invoke-direct {v0, v1, v4, v1, v1}, Lb0/w1;-><init>(Lya/a1;Lq4/i;Lq4/i;Lq4/i;)V

    .line 2123
    .line 2124
    .line 2125
    return-object v0

    .line 2126
    :goto_5e
    new-instance v0, Lb0/w1;

    .line 2127
    .line 2128
    invoke-direct {v0, v1, v4, v1, v1}, Lb0/w1;-><init>(Lya/a1;Lq4/i;Lq4/i;Lq4/i;)V

    .line 2129
    .line 2130
    .line 2131
    return-object v0
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
.end method

.method public static j([BII)Lq4/o;
    .locals 30

    .line 1
    const/4 v0, 0x1

    .line 2
    add-int/lit8 v1, p1, 0x1

    .line 3
    .line 4
    new-instance v2, Lp4/r;

    .line 5
    .line 6
    move-object/from16 v3, p0

    .line 7
    .line 8
    move/from16 v4, p2

    .line 9
    .line 10
    invoke-direct {v2, v3, v1, v4}, Lp4/r;-><init>([BII)V

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x8

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Lp4/r;->i(I)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {v2, v1}, Lp4/r;->i(I)I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    invoke-virtual {v2, v1}, Lp4/r;->i(I)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    const/16 v3, 0x56

    .line 32
    .line 33
    const/16 v8, 0x2c

    .line 34
    .line 35
    const/16 v9, 0xf4

    .line 36
    .line 37
    const/16 v10, 0x7a

    .line 38
    .line 39
    const/16 v11, 0x6e

    .line 40
    .line 41
    const/4 v12, 0x3

    .line 42
    const/16 v15, 0x64

    .line 43
    .line 44
    if-eq v4, v15, :cond_1

    .line 45
    .line 46
    if-eq v4, v11, :cond_1

    .line 47
    .line 48
    if-eq v4, v10, :cond_1

    .line 49
    .line 50
    if-eq v4, v9, :cond_1

    .line 51
    .line 52
    if-eq v4, v8, :cond_1

    .line 53
    .line 54
    const/16 v14, 0x53

    .line 55
    .line 56
    if-eq v4, v14, :cond_1

    .line 57
    .line 58
    if-eq v4, v3, :cond_1

    .line 59
    .line 60
    const/16 v14, 0x76

    .line 61
    .line 62
    if-eq v4, v14, :cond_1

    .line 63
    .line 64
    const/16 v14, 0x80

    .line 65
    .line 66
    if-eq v4, v14, :cond_1

    .line 67
    .line 68
    const/16 v14, 0x8a

    .line 69
    .line 70
    if-ne v4, v14, :cond_0

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    const/16 p1, 0x10

    .line 74
    .line 75
    const/4 v11, 0x0

    .line 76
    const/4 v13, 0x0

    .line 77
    const/4 v14, 0x1

    .line 78
    const/16 v18, 0x0

    .line 79
    .line 80
    goto/16 :goto_8

    .line 81
    .line 82
    :cond_1
    :goto_0
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 83
    .line 84
    .line 85
    move-result v14

    .line 86
    if-ne v14, v12, :cond_2

    .line 87
    .line 88
    invoke-virtual {v2}, Lp4/r;->h()Z

    .line 89
    .line 90
    .line 91
    move-result v16

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    const/16 v16, 0x0

    .line 94
    .line 95
    :goto_1
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 96
    .line 97
    .line 98
    move-result v17

    .line 99
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 100
    .line 101
    .line 102
    move-result v18

    .line 103
    invoke-virtual {v2}, Lp4/r;->s()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Lp4/r;->h()Z

    .line 107
    .line 108
    .line 109
    move-result v19

    .line 110
    if-eqz v19, :cond_8

    .line 111
    .line 112
    if-eq v14, v12, :cond_3

    .line 113
    .line 114
    const/16 v13, 0x8

    .line 115
    .line 116
    :goto_2
    const/16 p1, 0x10

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_3
    const/16 v19, 0xc

    .line 120
    .line 121
    const/16 v13, 0xc

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :goto_3
    const/4 v1, 0x0

    .line 125
    :goto_4
    if-ge v1, v13, :cond_9

    .line 126
    .line 127
    invoke-virtual {v2}, Lp4/r;->h()Z

    .line 128
    .line 129
    .line 130
    move-result v19

    .line 131
    if-eqz v19, :cond_7

    .line 132
    .line 133
    const/4 v9, 0x6

    .line 134
    if-ge v1, v9, :cond_4

    .line 135
    .line 136
    const/16 v9, 0x10

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_4
    const/16 v9, 0x40

    .line 140
    .line 141
    :goto_5
    const/4 v10, 0x0

    .line 142
    const/16 v20, 0x8

    .line 143
    .line 144
    const/16 v21, 0x8

    .line 145
    .line 146
    :goto_6
    if-ge v10, v9, :cond_7

    .line 147
    .line 148
    if-eqz v20, :cond_5

    .line 149
    .line 150
    invoke-virtual {v2}, Lp4/r;->n()I

    .line 151
    .line 152
    .line 153
    move-result v20

    .line 154
    add-int v11, v20, v21

    .line 155
    .line 156
    add-int/lit16 v11, v11, 0x100

    .line 157
    .line 158
    rem-int/lit16 v11, v11, 0x100

    .line 159
    .line 160
    move/from16 v20, v11

    .line 161
    .line 162
    :cond_5
    if-nez v20, :cond_6

    .line 163
    .line 164
    goto :goto_7

    .line 165
    :cond_6
    move/from16 v21, v20

    .line 166
    .line 167
    :goto_7
    add-int/lit8 v10, v10, 0x1

    .line 168
    .line 169
    const/16 v11, 0x6e

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 173
    .line 174
    const/16 v9, 0xf4

    .line 175
    .line 176
    const/16 v10, 0x7a

    .line 177
    .line 178
    const/16 v11, 0x6e

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_8
    const/16 p1, 0x10

    .line 182
    .line 183
    :cond_9
    move/from16 v13, v16

    .line 184
    .line 185
    move/from16 v11, v17

    .line 186
    .line 187
    :goto_8
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    add-int/lit8 v1, v1, 0x4

    .line 192
    .line 193
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    if-nez v9, :cond_a

    .line 198
    .line 199
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 200
    .line 201
    .line 202
    move-result v10

    .line 203
    add-int/lit8 v10, v10, 0x4

    .line 204
    .line 205
    move/from16 v17, v4

    .line 206
    .line 207
    move/from16 v23, v9

    .line 208
    .line 209
    move/from16 v3, v18

    .line 210
    .line 211
    :goto_9
    const/16 v18, 0x0

    .line 212
    .line 213
    goto :goto_b

    .line 214
    :cond_a
    if-ne v9, v0, :cond_c

    .line 215
    .line 216
    invoke-virtual {v2}, Lp4/r;->h()Z

    .line 217
    .line 218
    .line 219
    move-result v10

    .line 220
    invoke-virtual {v2}, Lp4/r;->n()I

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Lp4/r;->n()I

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 227
    .line 228
    .line 229
    move-result v15

    .line 230
    move/from16 v17, v4

    .line 231
    .line 232
    int-to-long v3, v15

    .line 233
    move/from16 v23, v9

    .line 234
    .line 235
    const/4 v15, 0x0

    .line 236
    :goto_a
    int-to-long v8, v15

    .line 237
    cmp-long v24, v8, v3

    .line 238
    .line 239
    if-gez v24, :cond_b

    .line 240
    .line 241
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 242
    .line 243
    .line 244
    add-int/lit8 v15, v15, 0x1

    .line 245
    .line 246
    goto :goto_a

    .line 247
    :cond_b
    move/from16 v3, v18

    .line 248
    .line 249
    move/from16 v18, v10

    .line 250
    .line 251
    const/4 v10, 0x0

    .line 252
    goto :goto_b

    .line 253
    :cond_c
    move/from16 v17, v4

    .line 254
    .line 255
    move/from16 v23, v9

    .line 256
    .line 257
    move/from16 v3, v18

    .line 258
    .line 259
    const/4 v10, 0x0

    .line 260
    goto :goto_9

    .line 261
    :goto_b
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2}, Lp4/r;->s()V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    add-int/2addr v4, v0

    .line 272
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 273
    .line 274
    .line 275
    move-result v8

    .line 276
    add-int/2addr v8, v0

    .line 277
    invoke-virtual {v2}, Lp4/r;->h()Z

    .line 278
    .line 279
    .line 280
    move-result v9

    .line 281
    rsub-int/lit8 v15, v9, 0x2

    .line 282
    .line 283
    mul-int v8, v8, v15

    .line 284
    .line 285
    if-nez v9, :cond_d

    .line 286
    .line 287
    invoke-virtual {v2}, Lp4/r;->s()V

    .line 288
    .line 289
    .line 290
    :cond_d
    invoke-virtual {v2}, Lp4/r;->s()V

    .line 291
    .line 292
    .line 293
    mul-int/lit8 v4, v4, 0x10

    .line 294
    .line 295
    mul-int/lit8 v8, v8, 0x10

    .line 296
    .line 297
    invoke-virtual {v2}, Lp4/r;->h()Z

    .line 298
    .line 299
    .line 300
    move-result v24

    .line 301
    const/16 v25, 0x2

    .line 302
    .line 303
    if-eqz v24, :cond_11

    .line 304
    .line 305
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 306
    .line 307
    .line 308
    move-result v24

    .line 309
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 310
    .line 311
    .line 312
    move-result v26

    .line 313
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 314
    .line 315
    .line 316
    move-result v27

    .line 317
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 318
    .line 319
    .line 320
    move-result v28

    .line 321
    if-nez v14, :cond_e

    .line 322
    .line 323
    const/16 v29, 0x1

    .line 324
    .line 325
    goto :goto_e

    .line 326
    :cond_e
    if-ne v14, v12, :cond_f

    .line 327
    .line 328
    const/16 v29, 0x1

    .line 329
    .line 330
    goto :goto_c

    .line 331
    :cond_f
    const/16 v29, 0x2

    .line 332
    .line 333
    :goto_c
    if-ne v14, v0, :cond_10

    .line 334
    .line 335
    const/4 v14, 0x2

    .line 336
    goto :goto_d

    .line 337
    :cond_10
    const/4 v14, 0x1

    .line 338
    :goto_d
    mul-int v15, v15, v14

    .line 339
    .line 340
    :goto_e
    add-int v24, v24, v26

    .line 341
    .line 342
    mul-int v24, v24, v29

    .line 343
    .line 344
    sub-int v4, v4, v24

    .line 345
    .line 346
    add-int v27, v27, v28

    .line 347
    .line 348
    mul-int v27, v27, v15

    .line 349
    .line 350
    sub-int v8, v8, v27

    .line 351
    .line 352
    :cond_11
    move v14, v9

    .line 353
    const/16 v15, 0x2c

    .line 354
    .line 355
    move v9, v8

    .line 356
    move v8, v4

    .line 357
    move/from16 v4, v17

    .line 358
    .line 359
    if-eq v4, v15, :cond_12

    .line 360
    .line 361
    const/16 v15, 0x56

    .line 362
    .line 363
    if-eq v4, v15, :cond_12

    .line 364
    .line 365
    const/16 v15, 0x64

    .line 366
    .line 367
    if-eq v4, v15, :cond_12

    .line 368
    .line 369
    const/16 v15, 0x6e

    .line 370
    .line 371
    if-eq v4, v15, :cond_12

    .line 372
    .line 373
    const/16 v15, 0x7a

    .line 374
    .line 375
    if-eq v4, v15, :cond_12

    .line 376
    .line 377
    const/16 v15, 0xf4

    .line 378
    .line 379
    if-ne v4, v15, :cond_13

    .line 380
    .line 381
    :cond_12
    and-int/lit8 v15, v5, 0x10

    .line 382
    .line 383
    if-eqz v15, :cond_13

    .line 384
    .line 385
    const/4 v15, 0x0

    .line 386
    goto :goto_f

    .line 387
    :cond_13
    const/16 v15, 0x10

    .line 388
    .line 389
    :goto_f
    invoke-virtual {v2}, Lp4/r;->h()Z

    .line 390
    .line 391
    .line 392
    move-result v16

    .line 393
    const/16 v17, -0x1

    .line 394
    .line 395
    const/high16 v19, 0x3f800000    # 1.0f

    .line 396
    .line 397
    if-eqz v16, :cond_22

    .line 398
    .line 399
    invoke-virtual {v2}, Lp4/r;->h()Z

    .line 400
    .line 401
    .line 402
    move-result v16

    .line 403
    if-eqz v16, :cond_14

    .line 404
    .line 405
    const/16 v0, 0x8

    .line 406
    .line 407
    invoke-virtual {v2, v0}, Lp4/r;->i(I)I

    .line 408
    .line 409
    .line 410
    move-result v12

    .line 411
    const/16 v0, 0xff

    .line 412
    .line 413
    if-ne v12, v0, :cond_15

    .line 414
    .line 415
    const/16 v0, 0x10

    .line 416
    .line 417
    invoke-virtual {v2, v0}, Lp4/r;->i(I)I

    .line 418
    .line 419
    .line 420
    move-result v12

    .line 421
    invoke-virtual {v2, v0}, Lp4/r;->i(I)I

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-eqz v12, :cond_14

    .line 426
    .line 427
    if-eqz v0, :cond_14

    .line 428
    .line 429
    int-to-float v12, v12

    .line 430
    int-to-float v0, v0

    .line 431
    div-float v19, v12, v0

    .line 432
    .line 433
    :cond_14
    :goto_10
    move/from16 p1, v1

    .line 434
    .line 435
    goto :goto_11

    .line 436
    :cond_15
    const/16 v0, 0x11

    .line 437
    .line 438
    if-ge v12, v0, :cond_16

    .line 439
    .line 440
    sget-object v0, Lq4/p;->b:[F

    .line 441
    .line 442
    aget v19, v0, v12

    .line 443
    .line 444
    goto :goto_10

    .line 445
    :cond_16
    const-string v0, "NalUnitUtil"

    .line 446
    .line 447
    move/from16 p1, v1

    .line 448
    .line 449
    const-string v1, "Unexpected aspect_ratio_idc value: "

    .line 450
    .line 451
    invoke-static {v12, v1, v0}, Lq/t0;->J(ILjava/lang/String;Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    :goto_11
    invoke-virtual {v2}, Lp4/r;->h()Z

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    if-eqz v0, :cond_17

    .line 459
    .line 460
    invoke-virtual {v2}, Lp4/r;->s()V

    .line 461
    .line 462
    .line 463
    :cond_17
    invoke-virtual {v2}, Lp4/r;->h()Z

    .line 464
    .line 465
    .line 466
    move-result v0

    .line 467
    if-eqz v0, :cond_1a

    .line 468
    .line 469
    const/4 v0, 0x3

    .line 470
    invoke-virtual {v2, v0}, Lp4/r;->t(I)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v2}, Lp4/r;->h()Z

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    if-eqz v0, :cond_18

    .line 478
    .line 479
    const/4 v0, 0x1

    .line 480
    goto :goto_12

    .line 481
    :cond_18
    const/4 v0, 0x2

    .line 482
    :goto_12
    invoke-virtual {v2}, Lp4/r;->h()Z

    .line 483
    .line 484
    .line 485
    move-result v1

    .line 486
    if-eqz v1, :cond_19

    .line 487
    .line 488
    const/16 v1, 0x8

    .line 489
    .line 490
    invoke-virtual {v2, v1}, Lp4/r;->i(I)I

    .line 491
    .line 492
    .line 493
    move-result v12

    .line 494
    invoke-virtual {v2, v1}, Lp4/r;->i(I)I

    .line 495
    .line 496
    .line 497
    move-result v16

    .line 498
    invoke-virtual {v2, v1}, Lp4/r;->t(I)V

    .line 499
    .line 500
    .line 501
    invoke-static {v12}, Lm4/h;->f(I)I

    .line 502
    .line 503
    .line 504
    move-result v17

    .line 505
    invoke-static/range {v16 .. v16}, Lm4/h;->g(I)I

    .line 506
    .line 507
    .line 508
    move-result v1

    .line 509
    goto :goto_14

    .line 510
    :cond_19
    :goto_13
    const/4 v1, -0x1

    .line 511
    goto :goto_14

    .line 512
    :cond_1a
    const/4 v0, -0x1

    .line 513
    goto :goto_13

    .line 514
    :goto_14
    invoke-virtual {v2}, Lp4/r;->h()Z

    .line 515
    .line 516
    .line 517
    move-result v12

    .line 518
    if-eqz v12, :cond_1b

    .line 519
    .line 520
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 524
    .line 525
    .line 526
    :cond_1b
    invoke-virtual {v2}, Lp4/r;->h()Z

    .line 527
    .line 528
    .line 529
    move-result v12

    .line 530
    if-eqz v12, :cond_1c

    .line 531
    .line 532
    const/16 v12, 0x41

    .line 533
    .line 534
    invoke-virtual {v2, v12}, Lp4/r;->t(I)V

    .line 535
    .line 536
    .line 537
    :cond_1c
    invoke-virtual {v2}, Lp4/r;->h()Z

    .line 538
    .line 539
    .line 540
    move-result v12

    .line 541
    if-eqz v12, :cond_1d

    .line 542
    .line 543
    invoke-static {v2}, Lq4/p;->k(Lp4/r;)V

    .line 544
    .line 545
    .line 546
    :cond_1d
    invoke-virtual {v2}, Lp4/r;->h()Z

    .line 547
    .line 548
    .line 549
    move-result v16

    .line 550
    if-eqz v16, :cond_1e

    .line 551
    .line 552
    invoke-static {v2}, Lq4/p;->k(Lp4/r;)V

    .line 553
    .line 554
    .line 555
    :cond_1e
    if-nez v12, :cond_1f

    .line 556
    .line 557
    if-eqz v16, :cond_20

    .line 558
    .line 559
    :cond_1f
    invoke-virtual {v2}, Lp4/r;->s()V

    .line 560
    .line 561
    .line 562
    :cond_20
    invoke-virtual {v2}, Lp4/r;->s()V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v2}, Lp4/r;->h()Z

    .line 566
    .line 567
    .line 568
    move-result v12

    .line 569
    if-eqz v12, :cond_21

    .line 570
    .line 571
    invoke-virtual {v2}, Lp4/r;->s()V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 575
    .line 576
    .line 577
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 578
    .line 579
    .line 580
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 581
    .line 582
    .line 583
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 584
    .line 585
    .line 586
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 587
    .line 588
    .line 589
    move-result v15

    .line 590
    invoke-virtual {v2}, Lp4/r;->m()I

    .line 591
    .line 592
    .line 593
    :cond_21
    move/from16 v12, v17

    .line 594
    .line 595
    move/from16 v17, v10

    .line 596
    .line 597
    move/from16 v10, v19

    .line 598
    .line 599
    move/from16 v19, v12

    .line 600
    .line 601
    move/from16 v20, v0

    .line 602
    .line 603
    move/from16 v21, v1

    .line 604
    .line 605
    move v12, v3

    .line 606
    move/from16 v22, v15

    .line 607
    .line 608
    goto :goto_15

    .line 609
    :cond_22
    move/from16 p1, v1

    .line 610
    .line 611
    move v12, v3

    .line 612
    move/from16 v17, v10

    .line 613
    .line 614
    move/from16 v22, v15

    .line 615
    .line 616
    const/high16 v10, 0x3f800000    # 1.0f

    .line 617
    .line 618
    const/16 v19, -0x1

    .line 619
    .line 620
    const/16 v20, -0x1

    .line 621
    .line 622
    const/16 v21, -0x1

    .line 623
    .line 624
    :goto_15
    new-instance v3, Lq4/o;

    .line 625
    .line 626
    move/from16 v15, p1

    .line 627
    .line 628
    move/from16 v16, v23

    .line 629
    .line 630
    invoke-direct/range {v3 .. v22}, Lq4/o;-><init>(IIIIIIFIIZZIIIZIIII)V

    .line 631
    .line 632
    .line 633
    return-object v3
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
.end method

.method public static k(Lp4/r;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lp4/r;->m()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {p0, v1}, Lp4/r;->t(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    if-ge v1, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lp4/r;->m()I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lp4/r;->m()I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lp4/r;->s()V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/16 v0, 0x14

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lp4/r;->t(I)V

    .line 30
    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public static l([BI)I
    .locals 8

    .line 1
    sget-object v0, Lq4/p;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    :cond_0
    :goto_0
    if-ge v2, p1, :cond_4

    .line 8
    .line 9
    :goto_1
    add-int/lit8 v4, p1, -0x2

    .line 10
    .line 11
    if-ge v2, v4, :cond_2

    .line 12
    .line 13
    :try_start_0
    aget-byte v4, p0, v2

    .line 14
    .line 15
    if-nez v4, :cond_1

    .line 16
    .line 17
    add-int/lit8 v4, v2, 0x1

    .line 18
    .line 19
    aget-byte v4, p0, v4

    .line 20
    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    add-int/lit8 v4, v2, 0x2

    .line 24
    .line 25
    aget-byte v4, p0, v4

    .line 26
    .line 27
    const/4 v5, 0x3

    .line 28
    if-ne v4, v5, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move v2, p1

    .line 35
    :goto_2
    if-ge v2, p1, :cond_0

    .line 36
    .line 37
    sget-object v4, Lq4/p;->d:[I

    .line 38
    .line 39
    array-length v5, v4

    .line 40
    if-gt v5, v3, :cond_3

    .line 41
    .line 42
    array-length v5, v4

    .line 43
    mul-int/lit8 v5, v5, 0x2

    .line 44
    .line 45
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    sput-object v4, Lq4/p;->d:[I

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto :goto_5

    .line 54
    :cond_3
    :goto_3
    sget-object v4, Lq4/p;->d:[I

    .line 55
    .line 56
    add-int/lit8 v5, v3, 0x1

    .line 57
    .line 58
    aput v2, v4, v3

    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x3

    .line 61
    .line 62
    move v3, v5

    .line 63
    goto :goto_0

    .line 64
    :cond_4
    sub-int/2addr p1, v3

    .line 65
    const/4 v2, 0x0

    .line 66
    const/4 v4, 0x0

    .line 67
    const/4 v5, 0x0

    .line 68
    :goto_4
    if-ge v2, v3, :cond_5

    .line 69
    .line 70
    sget-object v6, Lq4/p;->d:[I

    .line 71
    .line 72
    aget v6, v6, v2

    .line 73
    .line 74
    sub-int/2addr v6, v5

    .line 75
    invoke-static {p0, v5, p0, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 76
    .line 77
    .line 78
    add-int/2addr v4, v6

    .line 79
    add-int/lit8 v7, v4, 0x1

    .line 80
    .line 81
    aput-byte v1, p0, v4

    .line 82
    .line 83
    add-int/lit8 v4, v4, 0x2

    .line 84
    .line 85
    aput-byte v1, p0, v7

    .line 86
    .line 87
    add-int/lit8 v6, v6, 0x3

    .line 88
    .line 89
    add-int/2addr v5, v6

    .line 90
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    sub-int v1, p1, v4

    .line 94
    .line 95
    invoke-static {p0, v5, p0, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 96
    .line 97
    .line 98
    monitor-exit v0

    .line 99
    return p1

    .line 100
    :goto_5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    throw p0
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
