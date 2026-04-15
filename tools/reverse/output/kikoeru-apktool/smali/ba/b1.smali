.class public final Lba/b1;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Llf/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Llf/g;

.field public final synthetic c:Lba/f1;


# direct methods
.method public synthetic constructor <init>(Llf/g;Lba/f1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lba/b1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lba/b1;->b:Llf/g;

    .line 4
    .line 5
    iput-object p2, p0, Lba/b1;->c:Lba/f1;

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
.method public final n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lba/b1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Lba/d1;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Lba/d1;

    .line 12
    .line 13
    iget v1, v0, Lba/d1;->e:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, Lba/d1;->e:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lba/d1;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Lba/d1;-><init>(Lba/b1;Lyb/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, Lba/d1;->d:Ljava/lang/Object;

    .line 31
    .line 32
    iget v1, v0, Lba/d1;->e:I

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    const/4 v3, 0x1

    .line 36
    sget-object v4, Lzb/a;->a:Lzb/a;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    if-eq v1, v3, :cond_2

    .line 41
    .line 42
    if-ne v1, v2, :cond_1

    .line 43
    .line 44
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    iget p1, v0, Lba/d1;->h:I

    .line 57
    .line 58
    iget-object v1, v0, Lba/d1;->g:Llf/g;

    .line 59
    .line 60
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    check-cast p1, Li7/l1;

    .line 68
    .line 69
    iget-object v1, p0, Lba/b1;->b:Llf/g;

    .line 70
    .line 71
    iput-object v1, v0, Lba/d1;->g:Llf/g;

    .line 72
    .line 73
    const/4 p2, 0x0

    .line 74
    iput p2, v0, Lba/d1;->h:I

    .line 75
    .line 76
    iput v3, v0, Lba/d1;->e:I

    .line 77
    .line 78
    iget-object v3, p0, Lba/b1;->c:Lba/f1;

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {p1}, Lba/f1;->a(Li7/l1;)Li7/l1;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-ne p1, v4, :cond_4

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    move-object p2, p1

    .line 91
    const/4 p1, 0x0

    .line 92
    :goto_1
    const/4 v3, 0x0

    .line 93
    iput-object v3, v0, Lba/d1;->g:Llf/g;

    .line 94
    .line 95
    iput p1, v0, Lba/d1;->h:I

    .line 96
    .line 97
    iput v2, v0, Lba/d1;->e:I

    .line 98
    .line 99
    invoke-interface {v1, p2, v0}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-ne p1, v4, :cond_5

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    :goto_2
    sget-object v4, Lub/a0;->a:Lub/a0;

    .line 107
    .line 108
    :goto_3
    return-object v4

    .line 109
    :pswitch_0
    instance-of v0, p2, Lba/a1;

    .line 110
    .line 111
    if-eqz v0, :cond_6

    .line 112
    .line 113
    move-object v0, p2

    .line 114
    check-cast v0, Lba/a1;

    .line 115
    .line 116
    iget v1, v0, Lba/a1;->e:I

    .line 117
    .line 118
    const/high16 v2, -0x80000000

    .line 119
    .line 120
    and-int v3, v1, v2

    .line 121
    .line 122
    if-eqz v3, :cond_6

    .line 123
    .line 124
    sub-int/2addr v1, v2

    .line 125
    iput v1, v0, Lba/a1;->e:I

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_6
    new-instance v0, Lba/a1;

    .line 129
    .line 130
    invoke-direct {v0, p0, p2}, Lba/a1;-><init>(Lba/b1;Lyb/c;)V

    .line 131
    .line 132
    .line 133
    :goto_4
    iget-object p2, v0, Lba/a1;->d:Ljava/lang/Object;

    .line 134
    .line 135
    iget v1, v0, Lba/a1;->e:I

    .line 136
    .line 137
    const/4 v2, 0x2

    .line 138
    const/4 v3, 0x1

    .line 139
    sget-object v4, Lzb/a;->a:Lzb/a;

    .line 140
    .line 141
    if-eqz v1, :cond_9

    .line 142
    .line 143
    if-eq v1, v3, :cond_8

    .line 144
    .line 145
    if-ne v1, v2, :cond_7

    .line 146
    .line 147
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 152
    .line 153
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 154
    .line 155
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p1

    .line 159
    :cond_8
    iget p1, v0, Lba/a1;->h:I

    .line 160
    .line 161
    iget-object v1, v0, Lba/a1;->g:Llf/g;

    .line 162
    .line 163
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_9
    invoke-static {p2}, Lub/a;->f(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    check-cast p1, Li7/l1;

    .line 171
    .line 172
    iget-object v1, p0, Lba/b1;->b:Llf/g;

    .line 173
    .line 174
    iput-object v1, v0, Lba/a1;->g:Llf/g;

    .line 175
    .line 176
    const/4 p2, 0x0

    .line 177
    iput p2, v0, Lba/a1;->h:I

    .line 178
    .line 179
    iput v3, v0, Lba/a1;->e:I

    .line 180
    .line 181
    iget-object v3, p0, Lba/b1;->c:Lba/f1;

    .line 182
    .line 183
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-static {p1}, Lba/f1;->a(Li7/l1;)Li7/l1;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    if-ne p1, v4, :cond_a

    .line 191
    .line 192
    goto :goto_7

    .line 193
    :cond_a
    move-object p2, p1

    .line 194
    const/4 p1, 0x0

    .line 195
    :goto_5
    const/4 v3, 0x0

    .line 196
    iput-object v3, v0, Lba/a1;->g:Llf/g;

    .line 197
    .line 198
    iput p1, v0, Lba/a1;->h:I

    .line 199
    .line 200
    iput v2, v0, Lba/a1;->e:I

    .line 201
    .line 202
    invoke-interface {v1, p2, v0}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    if-ne p1, v4, :cond_b

    .line 207
    .line 208
    goto :goto_7

    .line 209
    :cond_b
    :goto_6
    sget-object v4, Lub/a0;->a:Lub/a0;

    .line 210
    .line 211
    :goto_7
    return-object v4

    .line 212
    nop

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 214
.end method
