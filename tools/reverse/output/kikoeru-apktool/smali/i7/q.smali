.class public final Li7/q;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public a:I

.field public b:I

.field public final c:Lvb/j;

.field public final d:Lc7/e1;

.field public e:Li7/c0;

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lvb/j;

    .line 5
    .line 6
    invoke-direct {v0}, Lvb/j;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Li7/q;->c:Lvb/j;

    .line 10
    .line 11
    new-instance v0, Lc7/e1;

    .line 12
    .line 13
    const/16 v1, 0x12

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lc7/e1;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Li7/q;->d:Lc7/e1;

    .line 19
    .line 20
    return-void
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
.method public final a(Li7/k0;)V
    .locals 6

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Li7/q;->f:Z

    .line 8
    .line 9
    instance-of v1, p1, Li7/i0;

    .line 10
    .line 11
    iget-object v2, p0, Li7/q;->d:Lc7/e1;

    .line 12
    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    check-cast p1, Li7/i0;

    .line 16
    .line 17
    iget-object v1, p1, Li7/i0;->e:Li7/c0;

    .line 18
    .line 19
    iget v3, p1, Li7/i0;->c:I

    .line 20
    .line 21
    iget v4, p1, Li7/i0;->d:I

    .line 22
    .line 23
    iget-object v5, p1, Li7/i0;->b:Ljava/util/List;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Lc7/e1;->W(Li7/c0;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p1, Li7/i0;->f:Li7/c0;

    .line 29
    .line 30
    iput-object v1, p0, Li7/q;->e:Li7/c0;

    .line 31
    .line 32
    iget-object p1, p1, Li7/i0;->a:Li7/d0;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iget-object v1, p0, Li7/q;->c:Lvb/j;

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    if-eq p1, v0, :cond_1

    .line 43
    .line 44
    const/4 v0, 0x2

    .line 45
    if-eq p1, v0, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    iput v4, p0, Li7/q;->b:I

    .line 49
    .line 50
    check-cast v5, Ljava/util/Collection;

    .line 51
    .line 52
    invoke-virtual {v1, v5}, Lvb/j;->addAll(Ljava/util/Collection;)Z

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    iput v3, p0, Li7/q;->a:I

    .line 57
    .line 58
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    sub-int/2addr p1, v0

    .line 63
    const/4 v0, 0x0

    .line 64
    const/4 v2, -0x1

    .line 65
    invoke-static {p1, v0, v2}, Lgh/g;->x(III)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    new-instance v3, Loc/c;

    .line 70
    .line 71
    invoke-direct {v3, p1, v0, v2}, Loc/c;-><init>(III)V

    .line 72
    .line 73
    .line 74
    :goto_0
    iget-boolean p1, v3, Loc/c;->c:Z

    .line 75
    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    invoke-virtual {v3}, Lvb/v;->nextInt()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    invoke-interface {v5, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {v1, p1}, Lvb/j;->addFirst(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    invoke-virtual {v1}, Lvb/j;->clear()V

    .line 91
    .line 92
    .line 93
    iput v4, p0, Li7/q;->b:I

    .line 94
    .line 95
    iput v3, p0, Li7/q;->a:I

    .line 96
    .line 97
    check-cast v5, Ljava/util/Collection;

    .line 98
    .line 99
    invoke-virtual {v1, v5}, Lvb/j;->addAll(Ljava/util/Collection;)Z

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_3
    instance-of v0, p1, Li7/f0;

    .line 104
    .line 105
    if-nez v0, :cond_5

    .line 106
    .line 107
    instance-of v0, p1, Li7/j0;

    .line 108
    .line 109
    if-eqz v0, :cond_4

    .line 110
    .line 111
    check-cast p1, Li7/j0;

    .line 112
    .line 113
    iget-object v0, p1, Li7/j0;->a:Li7/c0;

    .line 114
    .line 115
    invoke-virtual {v2, v0}, Lc7/e1;->W(Li7/c0;)V

    .line 116
    .line 117
    .line 118
    iget-object p1, p1, Li7/j0;->b:Li7/c0;

    .line 119
    .line 120
    iput-object p1, p0, Li7/q;->e:Li7/c0;

    .line 121
    .line 122
    :cond_4
    :goto_1
    return-void

    .line 123
    :cond_5
    check-cast p1, Li7/f0;

    .line 124
    .line 125
    const/4 p1, 0x0

    .line 126
    sget-object v0, Li7/a0;->c:Li7/a0;

    .line 127
    .line 128
    invoke-virtual {v2, p1, v0}, Lc7/e1;->Y(Li7/d0;Li7/b0;)V

    .line 129
    .line 130
    .line 131
    throw p1
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

.method public final b()Ljava/util/List;
    .locals 9

    .line 1
    iget-boolean v0, p0, Li7/q;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lvb/r;->a:Lvb/r;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Li7/q;->d:Lc7/e1;

    .line 14
    .line 15
    invoke-virtual {v1}, Lc7/e1;->f0()Li7/c0;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    iget-object v1, p0, Li7/q;->c:Lvb/j;

    .line 20
    .line 21
    invoke-virtual {v1}, Lvb/j;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    sget-object v2, Li7/i0;->g:Li7/i0;

    .line 28
    .line 29
    invoke-static {v1}, Lvb/m;->G0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget v5, p0, Li7/q;->a:I

    .line 34
    .line 35
    iget v6, p0, Li7/q;->b:I

    .line 36
    .line 37
    iget-object v8, p0, Li7/q;->e:Li7/c0;

    .line 38
    .line 39
    new-instance v2, Li7/i0;

    .line 40
    .line 41
    sget-object v3, Li7/d0;->a:Li7/d0;

    .line 42
    .line 43
    invoke-direct/range {v2 .. v8}, Li7/i0;-><init>(Li7/d0;Ljava/util/List;IILi7/c0;Li7/c0;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_1
    new-instance v1, Li7/j0;

    .line 51
    .line 52
    iget-object v2, p0, Li7/q;->e:Li7/c0;

    .line 53
    .line 54
    invoke-direct {v1, v7, v2}, Li7/j0;-><init>(Li7/c0;Li7/c0;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    return-object v0
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
