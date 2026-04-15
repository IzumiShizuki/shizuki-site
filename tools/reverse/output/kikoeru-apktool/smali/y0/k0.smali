.class public final Ly0/k0;
.super Lud/s;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public a:[Ly0/i0;

.field public b:I

.field public c:[I

.field public d:I

.field public e:[Ljava/lang/Object;

.field public f:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x10

    .line 5
    .line 6
    new-array v1, v0, [Ly0/i0;

    .line 7
    .line 8
    iput-object v1, p0, Ly0/k0;->a:[Ly0/i0;

    .line 9
    .line 10
    new-array v1, v0, [I

    .line 11
    .line 12
    iput-object v1, p0, Ly0/k0;->c:[I

    .line 13
    .line 14
    new-array v0, v0, [Ljava/lang/Object;

    .line 15
    .line 16
    iput-object v0, p0, Ly0/k0;->e:[Ljava/lang/Object;

    .line 17
    .line 18
    return-void
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
.end method


# virtual methods
.method public final F()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ly0/k0;->b:I

    .line 3
    .line 4
    iput v0, p0, Ly0/k0;->d:I

    .line 5
    .line 6
    iget-object v1, p0, Ly0/k0;->e:[Ljava/lang/Object;

    .line 7
    .line 8
    iget v2, p0, Ly0/k0;->f:I

    .line 9
    .line 10
    invoke-static {v0, v2, v1}, Lvb/l;->p0(II[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput v0, p0, Ly0/k0;->f:I

    .line 14
    .line 15
    return-void
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
.end method

.method public final G(Lx0/c;Lx0/d2;Lf1/m;Ly0/j0;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Ly0/k0;->I()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    new-instance v2, Lm4/j;

    .line 8
    .line 9
    invoke-direct {v2, p0}, Lm4/j;-><init>(Ly0/k0;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, v2, Lm4/j;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ly0/k0;

    .line 15
    .line 16
    :goto_0
    iget-object v1, v0, Ly0/k0;->a:[Ly0/i0;

    .line 17
    .line 18
    iget v3, v2, Lm4/j;->b:I

    .line 19
    .line 20
    aget-object v1, v1, v3

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ly0/i0;->e(Lm4/j;)Lx0/a;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    move-object v3, p1

    .line 27
    move-object v4, p2

    .line 28
    move-object v5, p3

    .line 29
    move-object v6, p4

    .line 30
    :try_start_0
    invoke-virtual/range {v1 .. v6}, Ly0/i0;->c(Lm4/j;Lx0/c;Lx0/d2;Lf1/m;Ly0/j0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    iget p1, v2, Lm4/j;->b:I

    .line 34
    .line 35
    iget p2, v0, Ly0/k0;->b:I

    .line 36
    .line 37
    if-lt p1, p2, :cond_0

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_0
    iget-object p3, v0, Ly0/k0;->a:[Ly0/i0;

    .line 41
    .line 42
    aget-object p3, p3, p1

    .line 43
    .line 44
    iget p4, v2, Lm4/j;->c:I

    .line 45
    .line 46
    iget v1, p3, Ly0/i0;->b:I

    .line 47
    .line 48
    add-int/2addr p4, v1

    .line 49
    iput p4, v2, Lm4/j;->c:I

    .line 50
    .line 51
    iget p4, v2, Lm4/j;->d:I

    .line 52
    .line 53
    iget p3, p3, Ly0/i0;->c:I

    .line 54
    .line 55
    add-int/2addr p4, p3

    .line 56
    iput p4, v2, Lm4/j;->d:I

    .line 57
    .line 58
    add-int/lit8 p1, p1, 0x1

    .line 59
    .line 60
    iput p1, v2, Lm4/j;->b:I

    .line 61
    .line 62
    if-ge p1, p2, :cond_2

    .line 63
    .line 64
    move-object p1, v3

    .line 65
    move-object p2, v4

    .line 66
    move-object p3, v5

    .line 67
    move-object p4, v6

    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    move-object p1, v0

    .line 71
    if-nez v6, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    new-instance p2, Lzg/b;

    .line 75
    .line 76
    const/4 p3, 0x1

    .line 77
    invoke-direct {p2, v7, v4, v6, p3}, Lzg/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 78
    .line 79
    .line 80
    invoke-static {p1, p2}, Lpc/f0;->V(Ljava/lang/Throwable;Lic/a;)Z

    .line 81
    .line 82
    .line 83
    :goto_1
    throw p1

    .line 84
    :cond_2
    :goto_2
    invoke-virtual {p0}, Ly0/k0;->F()V

    .line 85
    .line 86
    .line 87
    return-void
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

.method public final H()Z
    .locals 1

    .line 1
    iget v0, p0, Ly0/k0;->b:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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
.end method

.method public final I()Z
    .locals 1

    .line 1
    iget v0, p0, Ly0/k0;->b:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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
.end method

.method public final J(Ly0/i0;)V
    .locals 7

    .line 1
    iget v0, p0, Ly0/k0;->b:I

    .line 2
    .line 3
    iget-object v1, p0, Ly0/k0;->a:[Ly0/i0;

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    const/16 v3, 0x400

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    if-ne v0, v2, :cond_1

    .line 10
    .line 11
    if-le v0, v3, :cond_0

    .line 12
    .line 13
    const/16 v2, 0x400

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v2, v0

    .line 17
    :goto_0
    add-int/2addr v2, v0

    .line 18
    new-array v2, v2, [Ly0/i0;

    .line 19
    .line 20
    invoke-static {v1, v4, v2, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 21
    .line 22
    .line 23
    iput-object v2, p0, Ly0/k0;->a:[Ly0/i0;

    .line 24
    .line 25
    :cond_1
    iget v0, p0, Ly0/k0;->d:I

    .line 26
    .line 27
    iget v1, p1, Ly0/i0;->b:I

    .line 28
    .line 29
    iget v2, p1, Ly0/i0;->c:I

    .line 30
    .line 31
    add-int/2addr v0, v1

    .line 32
    iget-object v1, p0, Ly0/k0;->c:[I

    .line 33
    .line 34
    array-length v5, v1

    .line 35
    if-le v0, v5, :cond_4

    .line 36
    .line 37
    if-le v5, v3, :cond_2

    .line 38
    .line 39
    const/16 v6, 0x400

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v6, v5

    .line 43
    :goto_1
    add-int/2addr v6, v5

    .line 44
    if-ge v6, v0, :cond_3

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_3
    move v0, v6

    .line 48
    :goto_2
    new-array v0, v0, [I

    .line 49
    .line 50
    invoke-static {v4, v4, v5, v1, v0}, Lvb/l;->h0(III[I[I)V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, Ly0/k0;->c:[I

    .line 54
    .line 55
    :cond_4
    iget v0, p0, Ly0/k0;->f:I

    .line 56
    .line 57
    add-int/2addr v0, v2

    .line 58
    iget-object v1, p0, Ly0/k0;->e:[Ljava/lang/Object;

    .line 59
    .line 60
    array-length v5, v1

    .line 61
    if-le v0, v5, :cond_7

    .line 62
    .line 63
    if-le v5, v3, :cond_5

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_5
    move v3, v5

    .line 67
    :goto_3
    add-int/2addr v3, v5

    .line 68
    if-ge v3, v0, :cond_6

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_6
    move v0, v3

    .line 72
    :goto_4
    new-array v0, v0, [Ljava/lang/Object;

    .line 73
    .line 74
    invoke-static {v1, v4, v0, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, Ly0/k0;->e:[Ljava/lang/Object;

    .line 78
    .line 79
    :cond_7
    iget-object v0, p0, Ly0/k0;->a:[Ly0/i0;

    .line 80
    .line 81
    iget v1, p0, Ly0/k0;->b:I

    .line 82
    .line 83
    add-int/lit8 v3, v1, 0x1

    .line 84
    .line 85
    iput v3, p0, Ly0/k0;->b:I

    .line 86
    .line 87
    aput-object p1, v0, v1

    .line 88
    .line 89
    iget v0, p0, Ly0/k0;->d:I

    .line 90
    .line 91
    iget p1, p1, Ly0/i0;->b:I

    .line 92
    .line 93
    add-int/2addr v0, p1

    .line 94
    iput v0, p0, Ly0/k0;->d:I

    .line 95
    .line 96
    iget p1, p0, Ly0/k0;->f:I

    .line 97
    .line 98
    add-int/2addr p1, v2

    .line 99
    iput p1, p0, Ly0/k0;->f:I

    .line 100
    .line 101
    return-void
    .line 102
    .line 103
    .line 104
    .line 105
.end method
