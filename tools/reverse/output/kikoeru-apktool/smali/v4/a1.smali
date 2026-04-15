.class public final Lv4/a1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lv4/e;

.field public final b:I

.field public final c:Lv4/e;

.field public d:I

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Lv4/e;Lv4/e;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv4/a1;->a:Lv4/e;

    .line 5
    .line 6
    iput p3, p0, Lv4/a1;->b:I

    .line 7
    .line 8
    iput-object p2, p0, Lv4/a1;->c:Lv4/e;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lv4/a1;->d:I

    .line 12
    .line 13
    iput-boolean p1, p0, Lv4/a1;->e:Z

    .line 14
    .line 15
    iput-boolean p1, p0, Lv4/a1;->f:Z

    .line 16
    .line 17
    return-void
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

.method public static b(Lv4/e;)V
    .locals 3

    .line 1
    iget v0, p0, Lv4/e;->h:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 13
    .line 14
    .line 15
    iput v2, p0, Lv4/e;->h:I

    .line 16
    .line 17
    invoke-virtual {p0}, Lv4/e;->s()V

    .line 18
    .line 19
    .line 20
    :cond_1
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
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public static h(Lv4/e;)Z
    .locals 0

    .line 1
    iget p0, p0, Lv4/e;->h:I

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
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

.method public static m(Lv4/e;J)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lv4/e;->n:Z

    .line 3
    .line 4
    instance-of v0, p0, Ll5/d;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p0, Ll5/d;

    .line 9
    .line 10
    iget-boolean v0, p0, Lv4/e;->n:Z

    .line 11
    .line 12
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 13
    .line 14
    .line 15
    iput-wide p1, p0, Ll5/d;->J:J

    .line 16
    .line 17
    :cond_0
    return-void
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
.method public final a(Lv4/e;Lv4/k;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lv4/a1;->a:Lv4/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, p1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lv4/a1;->c:Lv4/e;

    .line 8
    .line 9
    if-ne v0, p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    :goto_1
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lv4/a1;->h(Lv4/e;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    iget-object v0, p2, Lv4/k;->c:Lv4/e;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    if-ne p1, v0, :cond_3

    .line 29
    .line 30
    iput-object v3, p2, Lv4/k;->d:Lv4/g0;

    .line 31
    .line 32
    iput-object v3, p2, Lv4/k;->c:Lv4/e;

    .line 33
    .line 34
    iput-boolean v2, p2, Lv4/k;->e:Z

    .line 35
    .line 36
    :cond_3
    invoke-static {p1}, Lv4/a1;->b(Lv4/e;)V

    .line 37
    .line 38
    .line 39
    iget p2, p1, Lv4/e;->h:I

    .line 40
    .line 41
    if-ne p2, v2, :cond_4

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_4
    const/4 v2, 0x0

    .line 45
    :goto_2
    invoke-static {v2}, Lp4/c;->i(Z)V

    .line 46
    .line 47
    .line 48
    iget-object p2, p1, Lv4/e;->c:Lv2/e;

    .line 49
    .line 50
    invoke-virtual {p2}, Lv2/e;->n()V

    .line 51
    .line 52
    .line 53
    iput v1, p1, Lv4/e;->h:I

    .line 54
    .line 55
    iput-object v3, p1, Lv4/e;->i:Lj5/c1;

    .line 56
    .line 57
    iput-object v3, p1, Lv4/e;->j:[Lm4/q;

    .line 58
    .line 59
    iput-boolean v1, p1, Lv4/e;->n:Z

    .line 60
    .line 61
    invoke-virtual {p1}, Lv4/e;->m()V

    .line 62
    .line 63
    .line 64
    return-void
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

.method public final c()I
    .locals 2

    .line 1
    iget-object v0, p0, Lv4/a1;->a:Lv4/e;

    .line 2
    .line 3
    invoke-static {v0}, Lv4/a1;->h(Lv4/e;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lv4/a1;->c:Lv4/e;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {v1}, Lv4/a1;->h(Lv4/e;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    add-int/2addr v0, v1

    .line 21
    return v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final d(Lv4/h0;)Lv4/e;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    iget-object p1, p1, Lv4/h0;->c:[Lj5/c1;

    .line 5
    .line 6
    iget v1, p0, Lv4/a1;->b:I

    .line 7
    .line 8
    aget-object p1, p1, v1

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v1, p0, Lv4/a1;->a:Lv4/e;

    .line 14
    .line 15
    iget-object v2, v1, Lv4/e;->i:Lj5/c1;

    .line 16
    .line 17
    if-ne v2, p1, :cond_1

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_1
    iget-object v1, p0, Lv4/a1;->c:Lv4/e;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    iget-object v2, v1, Lv4/e;->i:Lj5/c1;

    .line 25
    .line 26
    if-ne v2, p1, :cond_2

    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_2
    :goto_0
    return-object v0
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final e(Lv4/h0;Lv4/e;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, p1, Lv4/h0;->c:[Lj5/c1;

    .line 6
    .line 7
    iget v2, p0, Lv4/a1;->b:I

    .line 8
    .line 9
    aget-object v1, v1, v2

    .line 10
    .line 11
    iget-object v3, p2, Lv4/e;->i:Lj5/c1;

    .line 12
    .line 13
    if-eqz v3, :cond_4

    .line 14
    .line 15
    if-ne v3, v1, :cond_2

    .line 16
    .line 17
    if-eqz v1, :cond_4

    .line 18
    .line 19
    invoke-virtual {p2}, Lv4/e;->j()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_4

    .line 24
    .line 25
    iget-object v1, p1, Lv4/h0;->m:Lv4/h0;

    .line 26
    .line 27
    iget-object v3, p1, Lv4/h0;->g:Lv4/i0;

    .line 28
    .line 29
    iget-boolean v3, v3, Lv4/i0;->g:Z

    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    iget-boolean v3, v1, Lv4/h0;->e:Z

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    instance-of v3, p2, Ll5/d;

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    instance-of v3, p2, Lh5/b;

    .line 44
    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    iget-wide v3, p2, Lv4/e;->m:J

    .line 48
    .line 49
    invoke-virtual {v1}, Lv4/h0;->e()J

    .line 50
    .line 51
    .line 52
    move-result-wide v5

    .line 53
    cmp-long v1, v3, v5

    .line 54
    .line 55
    if-ltz v1, :cond_2

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    return v0

    .line 59
    :cond_2
    iget-object p1, p1, Lv4/h0;->m:Lv4/h0;

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    iget-object p1, p1, Lv4/h0;->c:[Lj5/c1;

    .line 64
    .line 65
    aget-object p1, p1, v2

    .line 66
    .line 67
    iget-object p2, p2, Lv4/e;->i:Lj5/c1;

    .line 68
    .line 69
    if-ne p1, p2, :cond_3

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    const/4 p1, 0x0

    .line 73
    return p1

    .line 74
    :cond_4
    :goto_0
    return v0
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

.method public final f()Z
    .locals 2

    .line 1
    iget v0, p0, Lv4/a1;->d:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x3

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
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

.method public final g()Z
    .locals 2

    .line 1
    iget v0, p0, Lv4/a1;->d:I

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    if-eq v0, v1, :cond_2

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lv4/a1;->c:Lv4/e;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget v0, v0, Lv4/e;->h:I

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    return v0

    .line 25
    :cond_2
    :goto_0
    iget-object v0, p0, Lv4/a1;->a:Lv4/e;

    .line 26
    .line 27
    invoke-static {v0}, Lv4/a1;->h(Lv4/e;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    return v0
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

.method public final i(I)Z
    .locals 6

    .line 1
    iget v0, p0, Lv4/a1;->d:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    iget v2, p0, Lv4/a1;->b:I

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    :cond_0
    if-ne p1, v2, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v1, 0x0

    .line 18
    :goto_0
    const/4 v5, 0x3

    .line 19
    if-ne v0, v5, :cond_2

    .line 20
    .line 21
    if-eq p1, v2, :cond_2

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    goto :goto_1

    .line 25
    :cond_2
    const/4 p1, 0x0

    .line 26
    :goto_1
    if-nez v1, :cond_4

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_3
    return v3

    .line 32
    :cond_4
    :goto_2
    return v4
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final j(Z)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, Lv4/a1;->e:Z

    .line 6
    .line 7
    if-eqz p1, :cond_3

    .line 8
    .line 9
    iget-object p1, p0, Lv4/a1;->a:Lv4/e;

    .line 10
    .line 11
    iget v2, p1, Lv4/e;->h:I

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p1, Lv4/e;->c:Lv2/e;

    .line 21
    .line 22
    invoke-virtual {v0}, Lv2/e;->n()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lv4/e;->q()V

    .line 26
    .line 27
    .line 28
    iput-boolean v1, p0, Lv4/a1;->e:Z

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-boolean p1, p0, Lv4/a1;->f:Z

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iget-object p1, p0, Lv4/a1;->c:Lv4/e;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget v2, p1, Lv4/e;->h:I

    .line 41
    .line 42
    if-nez v2, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    const/4 v0, 0x0

    .line 46
    :goto_1
    invoke-static {v0}, Lp4/c;->i(Z)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p1, Lv4/e;->c:Lv2/e;

    .line 50
    .line 51
    invoke-virtual {v0}, Lv2/e;->n()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lv4/e;->q()V

    .line 55
    .line 56
    .line 57
    iput-boolean v1, p0, Lv4/a1;->f:Z

    .line 58
    .line 59
    :cond_3
    return-void
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
.end method

.method public final k(Lv4/e;Lv4/h0;Lm5/u;Lv4/k;)I
    .locals 10

    .line 1
    const/4 v3, 0x1

    .line 2
    if-eqz p1, :cond_b

    .line 3
    .line 4
    iget v4, p1, Lv4/e;->h:I

    .line 5
    .line 6
    if-eqz v4, :cond_b

    .line 7
    .line 8
    iget-object v4, p0, Lv4/a1;->a:Lv4/e;

    .line 9
    .line 10
    if-ne p1, v4, :cond_1

    .line 11
    .line 12
    iget v5, p0, Lv4/a1;->d:I

    .line 13
    .line 14
    const/4 v6, 0x2

    .line 15
    if-eq v5, v6, :cond_0

    .line 16
    .line 17
    const/4 v6, 0x4

    .line 18
    if-ne v5, v6, :cond_1

    .line 19
    .line 20
    :cond_0
    return v3

    .line 21
    :cond_1
    iget-object v5, p0, Lv4/a1;->c:Lv4/e;

    .line 22
    .line 23
    const/4 v8, 0x3

    .line 24
    if-ne p1, v5, :cond_2

    .line 25
    .line 26
    iget v5, p0, Lv4/a1;->d:I

    .line 27
    .line 28
    if-ne v5, v8, :cond_2

    .line 29
    .line 30
    return v3

    .line 31
    :cond_2
    iget-object v5, p1, Lv4/e;->i:Lj5/c1;

    .line 32
    .line 33
    iget-object v6, p2, Lv4/h0;->c:[Lj5/c1;

    .line 34
    .line 35
    iget v7, p0, Lv4/a1;->b:I

    .line 36
    .line 37
    aget-object v6, v6, v7

    .line 38
    .line 39
    const/4 v9, 0x0

    .line 40
    if-eq v5, v6, :cond_3

    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    goto :goto_0

    .line 44
    :cond_3
    const/4 v5, 0x0

    .line 45
    :goto_0
    invoke-virtual {p3, v7}, Lm5/u;->b(I)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_4

    .line 50
    .line 51
    if-nez v5, :cond_4

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    iget-boolean v5, p1, Lv4/e;->n:Z

    .line 55
    .line 56
    if-nez v5, :cond_7

    .line 57
    .line 58
    iget-object v2, p3, Lm5/u;->c:[Lm5/r;

    .line 59
    .line 60
    aget-object v2, v2, v7

    .line 61
    .line 62
    if-eqz v2, :cond_5

    .line 63
    .line 64
    invoke-interface {v2}, Lm5/r;->length()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    goto :goto_1

    .line 69
    :cond_5
    const/4 v3, 0x0

    .line 70
    :goto_1
    new-array v4, v3, [Lm4/q;

    .line 71
    .line 72
    :goto_2
    if-ge v9, v3, :cond_6

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-interface {v2, v9}, Lm5/r;->g(I)Lm4/q;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    aput-object v5, v4, v9

    .line 82
    .line 83
    add-int/lit8 v9, v9, 0x1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_6
    iget-object v2, p2, Lv4/h0;->c:[Lj5/c1;

    .line 87
    .line 88
    aget-object v2, v2, v7

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-object v5, v4

    .line 94
    invoke-virtual {p2}, Lv4/h0;->e()J

    .line 95
    .line 96
    .line 97
    move-result-wide v3

    .line 98
    move-object v7, v5

    .line 99
    iget-wide v5, p2, Lv4/h0;->p:J

    .line 100
    .line 101
    iget-object v1, p2, Lv4/h0;->g:Lv4/i0;

    .line 102
    .line 103
    iget-object v1, v1, Lv4/i0;->a:Lj5/d0;

    .line 104
    .line 105
    move-object v0, v7

    .line 106
    move-object v7, v1

    .line 107
    move-object v1, v0

    .line 108
    move-object v0, p1

    .line 109
    invoke-virtual/range {v0 .. v7}, Lv4/e;->w([Lm4/q;Lj5/c1;JJLj5/d0;)V

    .line 110
    .line 111
    .line 112
    return v8

    .line 113
    :cond_7
    invoke-virtual {p1}, Lv4/e;->k()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_a

    .line 118
    .line 119
    move-object v1, p4

    .line 120
    invoke-virtual {p0, p1, p4}, Lv4/a1;->a(Lv4/e;Lv4/k;)V

    .line 121
    .line 122
    .line 123
    if-eqz v6, :cond_8

    .line 124
    .line 125
    invoke-virtual {p0}, Lv4/a1;->f()Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_b

    .line 130
    .line 131
    :cond_8
    if-ne p1, v4, :cond_9

    .line 132
    .line 133
    const/4 v9, 0x1

    .line 134
    :cond_9
    invoke-virtual {p0, v9}, Lv4/a1;->j(Z)V

    .line 135
    .line 136
    .line 137
    return v3

    .line 138
    :cond_a
    return v9

    .line 139
    :cond_b
    :goto_3
    return v3
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

.method public final l()V
    .locals 1

    .line 1
    iget-object v0, p0, Lv4/a1;->a:Lv4/e;

    .line 2
    .line 3
    invoke-static {v0}, Lv4/a1;->h(Lv4/e;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p0, v0}, Lv4/a1;->j(Z)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lv4/a1;->c:Lv4/e;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget v0, v0, Lv4/e;->h:I

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    invoke-virtual {p0, v0}, Lv4/a1;->j(Z)V

    .line 24
    .line 25
    .line 26
    :cond_2
    return-void
    .line 27
    .line 28
    .line 29
.end method

.method public final n()V
    .locals 7

    .line 1
    iget-object v0, p0, Lv4/a1;->a:Lv4/e;

    .line 2
    .line 3
    iget v1, v0, Lv4/e;->h:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    if-ne v1, v4, :cond_1

    .line 9
    .line 10
    iget v5, p0, Lv4/a1;->d:I

    .line 11
    .line 12
    const/4 v6, 0x4

    .line 13
    if-eq v5, v6, :cond_1

    .line 14
    .line 15
    if-ne v1, v4, :cond_0

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    :cond_0
    invoke-static {v3}, Lp4/c;->i(Z)V

    .line 19
    .line 20
    .line 21
    iput v2, v0, Lv4/e;->h:I

    .line 22
    .line 23
    invoke-virtual {v0}, Lv4/e;->r()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    iget-object v0, p0, Lv4/a1;->c:Lv4/e;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    iget v1, v0, Lv4/e;->h:I

    .line 32
    .line 33
    if-ne v1, v4, :cond_3

    .line 34
    .line 35
    iget v5, p0, Lv4/a1;->d:I

    .line 36
    .line 37
    const/4 v6, 0x3

    .line 38
    if-eq v5, v6, :cond_3

    .line 39
    .line 40
    if-ne v1, v4, :cond_2

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    :cond_2
    invoke-static {v3}, Lp4/c;->i(Z)V

    .line 44
    .line 45
    .line 46
    iput v2, v0, Lv4/e;->h:I

    .line 47
    .line 48
    invoke-virtual {v0}, Lv4/e;->r()V

    .line 49
    .line 50
    .line 51
    :cond_3
    return-void
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
